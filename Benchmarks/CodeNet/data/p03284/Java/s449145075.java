import java.util.*;
class Begin106{
	static Scanner scan = new Scanner(System.out);
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