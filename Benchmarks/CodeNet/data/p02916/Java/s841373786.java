import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();  //料理の個数
			int [] a = new int[n]; //それぞれの料理の配列
			int [] b = new int[n]; //それぞれの料理の満足度
			int [] c = new int[n-1]; //追加で得られる満足度
			
			
			for(int i = 0; i < a.length; i++) {
				a[i] = stdIn.nextInt();
			}
			
			for(int i = 0; i < b.length; i++) {
				b[i] = stdIn.nextInt();
			}
			
			for(int i = 0; i < c.length; i++) {
				c[i] = stdIn.nextInt();
			}
			
			int sum = 0;  //ここから満足度の合計を出す
			for(int i = 0; i < a.length; i++) {
				sum+=b[i];
				
				
				
				if(i!=0 && a[i]-a[i-1]==1) {
					sum+=c[i-2];
				}
				
			}
			System.out.println(sum);
			
			
			
			
	}

}
