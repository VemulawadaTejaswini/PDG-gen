import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		String result = "";
		if(a == b){
			result = "EQUAL";
		}else if(a > b){
			result = "GREATER";
		}else{
			result = "LESS";
		}
		System.out.println(result);
	}
}
