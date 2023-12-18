import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int A;
	static int B;
	static int K;
	static int ans=0;


	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		K = sc.nextInt();

		if ((A+K-1)<(B-K+1)) {
			for(int i=A;i<=A+K-1;i++){
				ans=i;
				System.out.println(ans);
			}
			for(int i=B-K+1;i<=B;i++){
				ans=i;
				System.out.println(ans);
			}
		}
		else{
			for(int i=A;i<=B;i++){
				ans=i;
				System.out.println(ans);
			}

		}


		
		//System.out.print(ans);
    }
}