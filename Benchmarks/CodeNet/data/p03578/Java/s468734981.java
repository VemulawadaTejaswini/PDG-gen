import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] t=new int[m];
		boolean is=true;
		for(int i=0;i<m;i++){
			t[i]=sc.nextInt();
		}
		if(n<m){
			is=false;
		}
		for(int i=0;is&&i<m;i++){
			int buf=t[i];
			for(int j=0;j<n;j++){
				if(d[j]==buf){
					d[j]=-1;
					break;
				}
				if(j==n-1){
					is=false;
					break;
				}
			}
		}
		if(is){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}