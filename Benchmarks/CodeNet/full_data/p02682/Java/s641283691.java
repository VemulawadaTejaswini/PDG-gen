import java.util.Scanner;
public class Main {
	static int[][] gyo2=new int[100000][12];
	static int count=0;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long K=sc.nextLong();
		long ans=0;
		if(K-A>=0) {
			ans+=A;
		}else {
			ans+=K;
		}
		K-=A;
		if(K>0) {
			K-=B;
		}
		if(K>0) {
			ans-=C;
		}
		System.out.println(ans);
}

}
