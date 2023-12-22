import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int v=1;
			while(a>1){
				int b=a%2;
				if(b==1){a-=1;}a/=2;
				if(b==1){
				System.out.print(b*v+" ");}//System.out.println(b);
				v*=2;
			}if(a==1)System.out.println(a*v);
		}
	}
}