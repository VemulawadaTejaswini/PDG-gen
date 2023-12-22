import java.util.Scanner;
class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				int y=sc.nextInt();
				int p=sc.nextInt();
				int yk=sc.nextInt();
				int pk=sc.nextInt();
				double ans=y*yk+p*pk;
				if(yk>=5&&pk>=2){
					ans*=0.8;
				}
				System.out.println((int)ans);
			}
			
		}

	}
}