import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;int X;
		do{
		N=  Integer.parseInt(sc.next());
		X= Integer.parseInt(sc.next());
		if(N!=0||X!=0) System.out.println(calc(N,X));
		}while(N!=0||X!=0);
		
		sc.close();
	}
	static int calc(int n,int x){
		int cnt=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++){
				for(int k=1;k<j;k++){
					if(i+j+k==x) cnt++;
				}
			}
		}
		return cnt;
	}
}