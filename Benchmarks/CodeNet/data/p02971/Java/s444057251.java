import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	int coursol = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
      
    	for( int i = 0 ; i < coursol ; i++){
 			list.add(sc.nextInt());
            }
  
    	for( int i = 0 ; i < coursol ; i++){
			int copy = list.get(i);
            list.remove(i);
          	Collections.sort(list, Collections.reverseOrder());
			System.out.println(list.get(0));
            list.add(i , copy);
            }
       }
}
