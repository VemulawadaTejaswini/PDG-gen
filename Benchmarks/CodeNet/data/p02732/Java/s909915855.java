import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//Random r = new Random();
		int N = sc.nextInt();
		int S[] = new int[N];
		int ct1[] = new int[200001];
		int ct2[] = new int[200001];
		int tmp;
		for(int i =0;i!=N;i++) {
			tmp=sc.nextInt();//sc.nextInt();
			S[i]=tmp;
			ct1[tmp]++;
			ct2[tmp]++;
			//System.out.println("tmp"+tmp+"ct"+ct1[tmp]+"ct2"+ct2[tmp]);
		}
		int total=0;
		for(int i= 0;i!=N;i++) {
			total=total+bikkuri(ct1[S[i]]);
			ct1[S[i]]=1;
		//	System.out.println(total);
		}
		for(int i=0;i!=N;i++) {
			System.out.println(total-bikkuri(ct2[S[i]])+bikkuri(ct2[S[i]]-1));
		}
	}
	
	
	
	
	static int bikkuri(int t){
		return t*(t-1)/2;
	}
}
