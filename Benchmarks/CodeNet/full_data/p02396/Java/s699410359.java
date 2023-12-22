import java.util.*;

class Main{
	public static void main(String args[]){
		int con = 0;
		int num = 1;
		Scanner scan = new Scanner(System.in);
		do{
			num = scan.nextInt();
			System.out.println("Case " + con + ": " + num);
			con++;
		}while(num!=0);
	}
}