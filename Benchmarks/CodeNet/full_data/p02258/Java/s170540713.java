import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int min,t,ans;//minはその時間までの最安値
		min=scan.nextInt();
		t=scan.nextInt();
		ans=t-min;
		if(t<min) min=t;
		for(int i=0;i<N-2;i++){
			t=scan.nextInt();
			if(ans<t-min){
				ans=t-min;
			}
			if(t<min){
				min=t;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}