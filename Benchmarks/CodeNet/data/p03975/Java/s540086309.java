import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
			int ans=0;
			for(int i=0;i<n;i++){
				int t=sc.nextInt();
				if(a>t || t>=b) ans++;
			}
			System.out.println(ans);
		}
	}
}