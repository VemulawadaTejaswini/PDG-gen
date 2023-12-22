import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner imput = new Scanner(System.in);
		int a = imput.nextInt();
		int b = imput.nextInt();
		if(a>b){
			System.out.println(a+">"+b);
		}else if(a<b){
			System.out.println(a+"<"+b);
		}else{
			System.out.println(a+"=="+b);
		}
	}
}