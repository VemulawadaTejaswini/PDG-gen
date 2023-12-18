import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int num = Integer.parseInt(a+b);
		boolean flg = false;
		for(int i = 1; i < num ; i++){
			if(i * i == num){
				flg = true;
				break;
			}
		}
		System.out.println(flg ? "Yes" : "No");
	}
}
