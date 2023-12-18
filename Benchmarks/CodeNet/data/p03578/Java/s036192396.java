import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		int m=sc.nextInt();
		boolean is=true;

		if(n<m){
			System.out.println("NO");
			return;
		}
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
		}
		for(int i=0;is&&i<m;i++){
			int buf=sc.nextInt();
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