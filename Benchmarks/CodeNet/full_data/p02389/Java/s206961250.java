import java.util.Scanner;
class Main{
	public static void main(String[]args){
		int t,y,men,syu;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		y=sc.nextInt();
		men=t*y;
		syu=t+t+y+y;
		System.out.print(men+" "+syu);
	}
}