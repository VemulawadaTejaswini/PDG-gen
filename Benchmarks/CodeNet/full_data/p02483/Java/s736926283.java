import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int middle;
		
		int max=a;
		if(b > a && b > c ){
		max = b;
		} 
		if(c > a && c > b){
		max = c;
		}
		
		int min = a;
		if(b < a && b < c){
		min = b;
		}
		if(c < a && c < b){
		min = c;
		}
		middle = (a + b + c) - (max + min);
		System.out.println(min + " "+ middle + " " + max);
	}
}