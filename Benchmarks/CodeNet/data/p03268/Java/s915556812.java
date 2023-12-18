import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			//ここに問題ごとのロジックを書く
			int n =scanner.nextInt();
			int k = scanner.nextInt();
			int cnt =0;
			for(int a=1;a<=n;a++){
				for(int b=1;b<=n;b++){
					for(int c=1;c<=n;c++){
						if( (a+b) % k ==0 && (b+c) % k==0 && (c+a) % k==0){
							cnt++;
						}
					}
					
				}
			}
			
			System.out.print(cnt);
		}finally{
			scanner.close();
		}
	}
}