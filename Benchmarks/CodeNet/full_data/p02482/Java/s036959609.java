import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a<b){
			System.out.printf("a<b\n");
		}else if(a>b){
			System.out.printf("a>b\n");
		}else System.out.printf("a==b\n");
	}
}