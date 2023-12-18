import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	static void crackers(){
		int n = scan.nextInt(), k = scan.nextInt();
		if(n/k==0)
			System.out.println("0");
		else
			System.out.println("1");
	}
	public static void main(String[] argv){
		crackers();
	}
}