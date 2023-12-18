import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] c = new int[n];
		int[] ct = new int[n];
		int mint = t+1;
		int ans = 0;
		
		for(int i=0; i<n; i++){
		    c[i] = sc.nextInt();
		    ct[i] = sc.nextInt();
		    if(ct[i] < mint){
		        mint = ct[i];
		        ans = c[i];
		    }
		}
		if(t < mint){
		    System.out.println("TLE");
		}else{
		    System.out.println(ans);
		}
    }
}