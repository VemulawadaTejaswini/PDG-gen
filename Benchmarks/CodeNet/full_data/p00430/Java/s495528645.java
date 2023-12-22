import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0){break;}
			run(n,n,"");
		}
	}

	static void run(int n, int limit, String ans){
		for(int i=limit;i>0; i--){
			if(n == i){
				System.out.println(ans+i);
			}else{
				run(n-i,(n-i)<i ? n-i:i,ans+i+" ");
			}
		}
	}
}