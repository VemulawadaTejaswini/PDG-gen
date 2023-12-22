
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String[] string =  br.readLine().split("");
	   int n = string.length;

	   PairList buffpair = new PairList();
	   Lakelist lakes = new Lakelist();
	   buff[] operand = new buff[n];

	   int x = 0;
	   int y = 0;

       for(int i = 0; i < n ;i++,x++){
    	   operand[i] = new buff();
    		   if(string[i].equals("\\") ){
    			       y--;
    			   if( ( 1<i && string[i-1].equals("/") ) || (1<i &&string[i-1].equals("_") &&string[i-2].equals("/") ) ){
    				   y++;
    			   }

    		   }
    		   else  if( string[i].equals("/") ){
    			   y++;
    			   if(string[i-1].equals("\\")  ){
    				   //System.out.println(" string[i-1]:"+string[i-1]);
   				       y--;
   			        }else if(1<i&&string[i-2].equals("\\") && string[i-1].equals("_")){
   			         //System.out.println("string[i-2]:"+string[i-2]+" string[i-1]"+string[i-1]  );
   			        	y--;
   			        }

     		   }
    		   else if( string[i].equals("_") ){
    			   //x++;

    		   }


    		   operand[i].setbuff(string[i], x, y);
    		   //operand[i].printbuff();
    	   //System.out.println(" x:"+x+" y:"+y +" i:"+i+ " string[i]:"+string[i]+" n:"+n);

       }

       int lake = 0;
       for(int i = 0; i < n ;i++){
    	   if( operand[i].string.equals("\\") ){
    		   for(int j = i+1; j < n ;j++){
    			   if( operand[j].string.equals("/") && operand[i].y == operand[j].y){
    				   buffpair.insert(operand[i].x, operand[j].x, operand[i].y, lake);
    				   lake++;
    				   break;
    			   }

    		   }

    	   }

       }




       //buffpair.printlist();

       buffpair.sethight();
       //System.out.println();

       buffpair.includeLake();
       buffpair.setlakenumber();

       buffpair.makelake(lakes);
       //buffpair.printlist();
       lakes.printsum();
       lakes.printlist();
       //System.out.println("rightx:"+rightx+" righty:"+righty+" x:"+x+" y:"+y +" i:"+i+" j:"+j+ " string[i]:"+string[i]+ " string[j]:"+string[j]);

   }


}


class buff {

	String string;
    int x;
    int y;

    void setbuff(String s, int X, int Y) {
        string = s;
        x = X;
        y = Y;
    }

    void printbuff(){

    	System.out.println(" x:"+x+" y:"+y+ " ?????????:"+string);
    }

}


class pair {

	int locationleft;
	int locationright;
    int width;
    int height;
    int lakenumber;
    boolean exist;

    pair prev;
    pair next;
    pair(int L, int R ,int H, int Lake) {
    	locationleft = L;
        locationright = R;
        width = ((R - L + 1) - 2 ) + 1;
        height = H;
        lakenumber = Lake;
        exist = true;
 	}


 	void setNext(pair next) {
         this.next = next;
     }

}

class PairList{

	pair dummy;

    pair tail;

    PairList() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new pair(-2,-2,-2,-2);
        dummy.next = dummy;
        dummy.prev = dummy;
        tail = dummy;
    }


	void insert(int left , int right, int H , int lake) {//?????????????´?????????\
        // ???????????????

        pair c = new pair(left , right,  H , lake);
        c.next = dummy.next;
        c.prev = dummy;
        dummy.next.prev = c;
        dummy.next = c;
        tail = dummy.prev;

    }

	void sethight() {//??????????????±?????????????????????

		for(pair end = dummy.next; end!=dummy; end = end.next ){

			for(pair tmp = end.next; tmp!=dummy; tmp = tmp.next ){

               if( end.height < tmp.height ){

            	   chengebuff(end,tmp);
               }
			}
		}
	}

	void setlakenumber() {//??????????????±?????????????????????

		for(pair end = dummy.next; end!=dummy; end = end.next ){

			for(pair tmp = end.next; tmp!=dummy; tmp = tmp.next ){

               if( end.lakenumber < tmp.lakenumber ){

            	   chengebuff(end,tmp);
               }
			}
		}
	}

	void includeLake() {//???????°´???????????????????°´??????????????´???

		for(pair end = dummy.next; end!=dummy; end = end.next ){

			for(pair tmp = end.next; tmp!=dummy; tmp = tmp.next ){

               if( end.height > tmp.height && end.locationleft < tmp.locationleft && end.locationright > tmp.locationright){

            	   tmp.lakenumber = end.lakenumber;


               }
			}
		}
	}


	void clearpair(pair clear ){


		for(pair end = dummy.next; end!=dummy; end = end.next ){
              if (end == clear  ){

            	  end.prev.next = clear.next;
            	  end.next.prev = clear.prev;
                  break;
              }

		}




	}


	void makelake(Lakelist lakes){

		int tmp = dummy.next.lakenumber;
        int sum = dummy.next.width;
		for(pair end = dummy.next; end!=dummy; end = end.next ){


			if(tmp != end.lakenumber){
				//System.out.println(sum);
                lakes.insert(sum);
				tmp = end.lakenumber;

				sum = end.width;

			}else{
				if( end.prev != dummy ){
					sum += end.width;
				}

			}
			//System.out.println(end.lakenumber+" "+sum+" " +tmp);

			if( end.next == dummy ){
				lakes.insert(sum);
			}

		}


	}

	void chengebuff(pair pair1,pair pair2  ) {//??????????????¨???

		int tmp;
		tmp = pair1.locationleft;
		pair1.locationleft = pair2.locationleft;
		pair2.locationleft = tmp;

		tmp = pair1.locationright;
		pair1.locationright = pair2.locationright;
		pair2.locationright = tmp;

		tmp = pair1.height;
		pair1.height = pair2.height;
		pair2.height = tmp;

		tmp = pair1.lakenumber;
		pair1.lakenumber = pair2.lakenumber;
		pair2.lakenumber = tmp;

		tmp = pair1.width;
		pair1.width = pair2.width;
		pair2.width = tmp;

	}





	void printlist() {//??????????????¨???

		for(pair end = dummy.next; end!=dummy; end = end.next ){

		  if(end.exist){
			System.out.println( "??????:" + end.locationleft+ " ??????: "+end.locationright+" ???:"+end.width+ " ??????:"+end.height+" ?°´???????????????:"+end.lakenumber );
		  }

		}


        System.out.println();

	}


}

class Lake{

	int depth;
	Lake next;
	Lake prev;

	Lake(int d) {
    	depth = d;
 	}

}

class Lakelist{

	Lake dummy;

	Lake tail;

	Lakelist() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new Lake(0);
        dummy.next = dummy;
        dummy.prev = dummy;
        tail = dummy;
    }


	void insert(int d) {//?????????????´?????????\
        // ???????????????

        Lake c = new Lake(d);
        c.next = dummy.next;
        c.prev = dummy;
        dummy.next.prev = c;
        dummy.next = c;
        tail = dummy.prev;

    }


	void printsum(){

		int i = 0;
		int sum = 0;
		for(Lake end = dummy.next; end!=dummy; end = end.next,i++ ){


			sum += end.depth;


		}


        System.out.println(sum);
        System.out.print(i+" ");

	}

	void printlist() {//??????????????¨???

		for(Lake end = dummy.next; end!=dummy; end = end.next ){


			System.out.print( end.depth );

			if(end.next != dummy){
				System.out.print( " " );
			}


		}


        System.out.println();

	}

}