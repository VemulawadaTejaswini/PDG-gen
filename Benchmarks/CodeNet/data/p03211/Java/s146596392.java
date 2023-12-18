import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int co = 9999;
		for(int i = 0; i < a.length()-2; i++){
			String b = a.substring(i,i+3);
			int c = Integer.parseInt(b);
			if(Math.abs(753-c)<co){
				co = Math.abs(753-c);
			}
		}
		System.out.println(co);
	}
}