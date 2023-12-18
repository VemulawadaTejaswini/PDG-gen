import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int an[] = new int[a+1];
		int ans=1;
		for(int i=0;i<a+1;i++){
			an[i]=1;
		}
		for(int i=2;i<=a;i++){
			while(i%2==0){
				i/=2;
				an[2]++;
			}
			for(int n=3;n*n<=i;n+=2){
				while(i%n==0){
				i /= n;
				an[n]++;
				}
			}
			if(i>1){
				an[i]++;
			}
		}
		for(int i=0;i<a+1;i++){
			ans = ans*an[i];
		}
		System.out.println(ans);
 }
}