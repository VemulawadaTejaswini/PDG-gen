import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		System.out.println(-1<N.indexOf("7")?"Yes":"No");
	}
}