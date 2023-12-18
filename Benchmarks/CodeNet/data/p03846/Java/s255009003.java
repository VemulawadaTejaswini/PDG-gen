import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		int[] d = new int[a];
		long ans = 1;
		int judge=0;
		b[0]=0;
		for(int i = 0 ; i < a; i++){
			d[i] = sc.nextInt();
			b[d[i]]++;
			if(b[d[i]]==2 && d[i]!=0){
					judge++;
				}
		}
		if((a/2!=judge) || (a%2==1 && b[0]==0)){
			System.out.println(0);
			return;
		}
			for(int i = 0; i < a; i++){
				
				ans*=b[d[i]];
				b[d[i]]--;
			}
		System.out.println(ans%1000000007);
	}
}