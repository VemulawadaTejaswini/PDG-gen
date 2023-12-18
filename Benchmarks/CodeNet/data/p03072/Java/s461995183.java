import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=0;
		int ans=0;
		for(int i = 0; i<n; i++){
			int h = sc.nextInt();
			if(h>=k){
				ans++;
				k=h;
			}
		}
		System.out.println(ans);
	}
}
