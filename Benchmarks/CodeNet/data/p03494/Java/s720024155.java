import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	int count = 0;
        boolean f = true;
      	for (int i = 0; i < n ; i++){
        	a[i] = Integer.parseInt(sc.next());
        }
      while(f){
      	for (int i = 0; i < b; i++) {
      		if(a[i]%2==0){
        		a[i] = a[i]/2;
        	}
          	else{
              f = false;
            	break;
            }
        }
        count++;
   	 }
     System.out.print(count);
   }
}
