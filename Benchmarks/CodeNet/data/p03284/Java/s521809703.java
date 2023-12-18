import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	static void crackers(){
		int n = scan.nextInt(), k = scan.nextInt();
		int m;
		if(n/k==0)
			m = 0;
		else
			m = 1;
		System.out.println(m);
	}
	public static void main(String[] argv){
		crackers();
	}
}