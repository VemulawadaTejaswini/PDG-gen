import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
      	int position = 1;
      	long count = 0;
		List<Integer> l = new ArrayList<Integer>();
	    List<Integer> checkList = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			l.add(sc.nextInt());
		}

      	for(long i=0;i<k;i++){
            position = l.get(position-1);
          if(i==k-1){
          	System.out.println(position);
              System.exit(0);
          }
          
          	if(checkList.contains(position)){
          		int point = position;
           //   System.out.println("i="+i); 
          //    System.out.println(point); 
   /**           do{
                //System.out.println("position="+position); 
                //System.out.println("point="+point); 
                position = l.get(position-1);      
               // System.out.println("position="+position); 
              	count ++;
                 if(i+count==k-1){
          	System.out.println(position);
  // System.out.println("aaa");
              System.exit(0);
          }
              }while(position!=point);**/
         //     System.out.println(count);
             // System.out.println(i);
           //   System.out.println(l.indexOf(position));
             //System.out.println(i+1-l.indexOf(position));
              int answerCount = (int)(i+((k-i)%(i+1-l.indexOf(position))));
             // System.out.println(answerCount);
              position = 1;
              for(int j =0;j<answerCount;j++){
                position = l.get(position-1);
              }
              System.out.println(position); 
             	System.exit(0);	
          		
            }

            checkList.add(position);
          //System.out.println(position);
      }	
      //System.out.println(position);
	}
}
