import java.util.Scanner;

class Main{
	static public void main(String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a>b){
			System.out.println("a>b");
		} else if(a<b){
			System.out.println("a<b");
		} else {
			System.out.println("a==b");
		}
	}
}