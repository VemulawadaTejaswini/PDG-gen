import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
      	double m = scanner.nextFloat();
      	int total = 0;
      	int[] a = new int[n];
      	for(int i =0; i<n; i++){
        	a[i] = scanner.nextInt();
          	total += a[i];
        }
      	int num = 0;
      	for(int i =0; i<n; i++){
        	if(a[i] >= total/(4*m)){num += 1;}
        }
      if(num >= m){
      	System.out.println("Yes");
      }else{
      	System.out.println("No");
      }
          
    }
}
