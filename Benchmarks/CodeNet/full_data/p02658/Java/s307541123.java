import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long count = Long.parseLong(sc.next());
      	long suuzi = 1;
      	final long limit = 1000000000000000000L;
      	for (int i=0; i<count; i++){
          	long item = Long.parseLong(sc.next());
          	if (suuzi < limit){
          		suuzi = item * suuzi;
            }else if (item == 0){
             	suuzi = 0; 
            }
        }
        
      	if(suuzi > limit){
          	suuzi = -1;
        }
      	System.out.println(suuzi);
    }

}