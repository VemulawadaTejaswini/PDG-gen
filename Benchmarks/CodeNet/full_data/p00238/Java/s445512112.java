import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int num = in.nextInt();
			if(num == 0)break;
			int n = in.nextInt();
			int cnt = 0;
			for(int i = 0;i < n;i++){
				int s = in.nextInt();
				int e = in.nextInt();
				cnt = cnt + e - s;
			}
			if(cnt >= num){
				System.out.println("OK");
			}else{
				System.out.println((num - cnt));
			}
		}
	}
}