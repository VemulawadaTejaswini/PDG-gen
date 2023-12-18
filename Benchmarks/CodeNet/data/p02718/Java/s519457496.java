import java.util.*;
public class Main{
public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
      	int m = scanner.nextInt();
      	int total = 0;
      	int[] a = new int[n];
      	for(int i =0; i<n; i++){
        	a[i] = scanner.nextInt();
          	total += a[i];
        }
      	int num = m;
      	for(int i =0; i<n; i++){
          if(num == 0){break;}
        	if(a[i] >= total/(4*m)){num--;}
        }
      if(num == 0){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
          
    }
}
