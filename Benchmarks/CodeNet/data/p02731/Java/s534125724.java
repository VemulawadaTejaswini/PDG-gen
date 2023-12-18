import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int ans= 0;
        for(int i=1;i<=L;i++){
        	for(int j=1;j<=L-i;j++){
        		ans=Math.max(ans,i*j*(L-i-j));
        	}
        }
        System.out.println((double)ans);
        }
    }