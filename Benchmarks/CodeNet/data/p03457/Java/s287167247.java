import java.util.Scanner;

public class Main{
	static Scanner s = new Scanner(System.in);			//文字の入力

	static int N = s.nextInt();



	static boolean flag = true;

	static int sum =0;

	public static void main(String[] args){
		solve();
	}

	static void solve() {
		int t[] = new int [N];
		int x[] = new int [N];
		int y[] = new int [N];
		int z[] = new int [N];


		for(int i= 0;i<N;i++){
			t[i]=s.nextInt();
			x[i]=s.nextInt();
			y[i]=s.nextInt();			//入力
			z[i] = x[i]+ y[i];
			
		}
		boolean check1=false;
		boolean check2= false;
		if(N == 1){
			if(t[0] < (z[0]) || (t[0]%2+(z[0+1]-z[0])%2==1)){
				flag = false;
			}
		}else{
			for(int i= 0;i<N-1;i++){
				if(i == 0){
					if(t[i] < (z[i]) || (t[i]%2+(z[i+1]-z[i])%2==1)||(x[i+1]==x[i]&&y[i+1] == y[i])){
						flag = false;
					}

				}else if((t[i+1] - t[i]) < (z[i+1]-z[i])|| (t[i]%2+(z[i+1]-z[i])%2==1)||(x[i+1]==x[i]&&y[i+1] == y[i])){
					flag = false;
				}
			}
		}

		if(flag == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}



}