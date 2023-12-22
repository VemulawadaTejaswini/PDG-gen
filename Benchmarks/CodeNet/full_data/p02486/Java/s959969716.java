import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int x = in.nextInt();
			if(n==0 && x==0) break;
			int ans = 0;
			for(int a=1; a<n; a++){
				for(int b=a+1; b<n; b++){
//					System.out.println(a+" "+b+" "+(x-a-b));
					if((x-a-b)>b && (x-a-b)<=n){
						ans++;
//						System.out.println(a+" "+b+" "+(x-a-b));
					}
				}
			}
			System.out.println(ans);
		}
	}
}