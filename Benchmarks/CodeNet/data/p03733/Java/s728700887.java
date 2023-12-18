import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t1 = sc.nextInt();
		int[] t = new int[n];
		int sum = t1;
		
		t[0] = sc.nextInt();
		
		for(int i=1; i<n; i++){
		    t[i] = sc.nextInt();
		    if(t[i]-t[i-1]<=t1){
            	sum = t[i]-t[i-1] + sum;
            }else{
              	sum = t1+sum;
            }
		}
		
		
      	System.out.println(sum);
    }
}