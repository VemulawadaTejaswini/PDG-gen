import java.util.*;

class Main {

	public static void main(String[] args){
		
		Scanner answer = new Scanner(System.in);

		int a = answer.nextInt();
		int b = answer.nextInt();
		int area = a*b;
		int periphery =(a+b)*2;

		System.out.println(area + " " + periphery);

	}
 }