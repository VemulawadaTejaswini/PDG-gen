import java.util.*;

class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = a+b;
	boolean isEven = (a+b)%2==0;

	if(isEven){
		System.out.println((a+b)/2);
	}else{
		System.out.println("IMPOSSIBLE");
	}
	}
}
