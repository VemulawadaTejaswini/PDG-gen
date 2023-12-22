import java.util.Scanner;
class Main{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			if(n==0)break;
			int Aans=0;
			int Bans=0;
			int a=0;
			int b=0;
			int temp;
			for(int i=0;i<n;i++){
				a=sc.nextInt();
				b=sc.nextInt();
				if(a!=b){
					temp=Math.max(a, b);
					if(temp==a){
						Aans+=a+b;
					}else if(temp==b){
						Bans+=a+b;
					}
				}else{
					Aans+=a;
					Bans+=b;
				}
			}
			System.out.println(Aans+" "+Bans);

		}
		
	}
}