import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		String S = in.nextLine();
		String s2 = in.nextLine();
		int state = 0;//初期状態0、縦1,横2
		long ans = 3L;
		if(N==1){
			System.out.println("3");
			System.exit(0);
		}
		for(int i=0; i<N; i++){
			if(i==N-1)break;
			if(S.charAt(i) == S.charAt(i+1)){
				if(state==1 || state==0){
					ans *= 2;
				}else if(state==2){
					ans *= 4;
				}
				state = 2;
			}else{
				if(state==0){
					ans *= 1;
				}else{
					ans *= 2;
				}
				state = 1;
			}
			
		}
		if(state==1){
			ans *= 2;
		}
		System.out.println(ans%1000000007L);
	}
}
