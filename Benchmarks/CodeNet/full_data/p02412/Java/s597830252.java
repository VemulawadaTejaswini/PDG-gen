public class Main {

	public static void main(String[] args) {
		//入力導入部
		Scanner sc=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		for(;;){
			int n=sc.nextInt();
			int x=sc.nextInt();
			if(n==0&&x==0)break;
			///////////////////////////////////////////////////////////////////
			//計算部			x=n+n-i+n-l
			int count=0;
			for(int i=1;3*i+3<=n;i++){
				for(int l=i+1;i+2l+1<=n;l++){
					for(int s=l+1;s+i+l<=n;s++)
						if(x==n+i+l){
						count++;
					}
				}
			}System.out.println(count);
		}
		}
	}