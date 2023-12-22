import java.util.Scanner;

//Sum of 4 Integers II
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2001];
		for(int i=0;i<=1000;i++)for(int j=0;j<=1000;j++)a[i+j]++;
		while(sc.hasNext()){
			int s = sc.nextInt(), res = 0;
			for(int i=Math.min(s, 2000);i>=0;i--)res+=a[i]*a[s-i];
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}