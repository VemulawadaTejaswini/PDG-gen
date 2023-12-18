import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a<b/2){
			System.out.println(b/2+(a-b/2)/4);
		}else{
			System.out.println(b/2);
		}
	}
}