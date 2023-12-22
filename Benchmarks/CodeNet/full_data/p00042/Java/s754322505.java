import java.util.*;

//01ナップサック
class Main {
	Scanner sc = new Scanner(System.in);

	class Tre{
		int weight;
		int value;
		Tre(int value,int weight){
			this.weight=weight;
			this.value=value;
		}
	}

	public void run() {
		int c=0;
		while (true) {
			c++;
			int W=sc.nextInt();if(W==0)break;
			int n=sc.nextInt();

			int[][] dp=new int[n][W+1];
			List<Tre> tres=new ArrayList<Tre>();
			for(int i=0;i<n;i++){
				String[] str=sc.next().split(",");
				tres.add(new Tre(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
			}
			int i=0;
			for(Tre tre:tres){
				//Tre tre=tres.get(0);
				for(int w=0;w<=W;w++){
					if(w>=tre.weight){
						dp[i][w]=
						i==0?tre.value:
						Math.max(dp[i-1][w],dp[i-1][w-tre.weight]+tre.value);
					}else{
						dp[i][w]=(i!=0)?dp[i-1][w]:0;
					}
				}
				i++;
			}
			int weight=dp[n-1][W];
			int windex=-1;
			for(int w=W;w>=0;w--){
				if(dp[n-1][w]!=weight){
					windex=w+1;
					break;
				}
			}
			ln("Case "+c+":");
			ln(dp[n-1][W]);
			ln(windex);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}