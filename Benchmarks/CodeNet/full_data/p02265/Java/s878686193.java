

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String args[]) throws IOException{

	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt( br.readLine() );

      List Doublelink = new List();
      String[] order = new String[n];
      for(int i = 0; i < n; i++ ){
        order[i] =  br.readLine();
      }


      for(int i = 0; i < n; i++ ){

    	  String[] string =  order[i].split(" ");

    	  if( string[0].equals("insert") ){
    		 // System.out.println("check1 " + i);
    		  Doublelink.insert( Integer.parseInt( string[1] ) );
    		  //Doublelink.printlist();
    	  }
    	  else if( string[0].equals("delete") ){
    		  //System.out.println("check2 "+ i);
    		  Doublelink.delete( Integer.parseInt( string[1] ) );
    	  }
    	  else if( string[0].equals("deleteFirst") ){
    		  Doublelink.deleteFirst();
    	  }
    	  else if( string[0].equals("deleteLast") ){
    		  Doublelink.deleteLast();
    	  }

    	 // System.out.println(n);
      }

      Doublelink.printlist();

 }
}


class Cell{

	Cell prev;
	Cell next;
	int data;

	Cell(int d) {
	   data = d;
	}

	void setNext(Cell next) {
        this.next = next;
    }
    // next?????????
    Cell getNext() {
        return next;
    }
    // prev??????????????????
    void setPrev(Cell prev) {
        this.prev = prev;
    }
    // prev?????????
   Cell getPrev() {
        return prev;
    }
    // ??????????????????
    int getData() {
        return data;
    }

}

class List{

    Cell dummy;

	List() {
        // ??????????????????????????????next??¨prev????????????????????????????¨??????????
        dummy = new Cell(0);
        dummy.setNext(dummy);
        dummy.setPrev(dummy);
    }


	void insert(int data) {//?????????????´?????????\
        // ???????????????

        Cell c = new Cell(data);
        c.setNext(dummy.getNext());
        c.setPrev(dummy);
        dummy.getNext().setPrev(c);
        dummy.setNext(c);


    }

	void deleteFirst() {//?????????????´??????????
        Cell c = dummy.getNext();
        c.getNext().setPrev(c.getPrev());
        c.getPrev().setNext(c.getNext());
    }

	void deleteLast() {//????°????????´??????????
		Cell end = dummy.getNext();
        while(end.getNext()!=null){
        	end = end.getNext();
        }
        end.setPrev( null );
        end.getPrev().setNext( null );
    }

	void delete(int data ) {//???????????????????´??????????


		Cell deletecell = dummy.getNext();


        while( deletecell.getNext() != null){

        	if( deletecell.getData() == data ){
        		deletecell.getPrev().setNext( deletecell.getNext() );
                deletecell.getNext().setPrev( deletecell.getPrev() );
                break;
        	}
        	deletecell = deletecell.getNext();

        }



	}

	void printlist() {//??????????????¨???

		Cell end = dummy.getNext();
        while(end!=dummy){
        	//System.out.println( end);
        	System.out.print( end.getData() );


        	if(end.getNext().getNext()!=null){
            	System.out.print( " " );
            }
        	end = end.getNext();
        }

        System.out.println();

	}

}