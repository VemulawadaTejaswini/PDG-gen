import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int ans=0;
			if(n==0)break;
			for (int i = 1; i < n;i++){
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum+=j;
					if(sum==n){
						ans++;
					}
					if(sum>n)break;
				}
			}
			System.out.println(ans);
		}
	}

}