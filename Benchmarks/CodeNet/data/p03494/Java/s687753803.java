import java.util.*;
import java.lang.*;
public class Contest {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	int b = a.length;
      	int count = 0;
      	for (int i = 0; i < b ; i++){
        	a[i] = Integer.parseInt(sc.next());
        }
      while(true){
      	for (int i = 0; i < b; i++) {
      		if(a[i]%2==0){
        		a[i] = a[i]/2;
        	}
          	else{
            	break;
            }
        }
        count++;
        break;
   	 }
     System.out.print(count);
   }
}
