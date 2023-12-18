import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int m = scan.nextInt();
      	int[] a = new int[m];
      	for(int i = 0; i < m; i++){
        	a[i] = scan.nextInt();
        }
      	Arrays.sort(a);
      	System.out.print(a[m-1]);
      	System.out.println(a[m-2]);
      	for(int j = m-1; j > 2; j--){
          	System.out.print(a[j-2]);
          	System.out.println(a[j]-a[j-1]);
        }
    }

}