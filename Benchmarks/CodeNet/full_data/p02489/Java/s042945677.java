import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int i=1;
		while(true){
			int a=sc.nextInt();
			if(a==0){
				break;
			}
			System.out.println("Case" + i +":" + a);
			i++;
		}
	}
}