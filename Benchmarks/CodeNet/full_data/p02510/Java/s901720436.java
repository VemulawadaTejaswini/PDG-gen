import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String a = sc.next();
			if(a.equals("-"))break;
			int m = sc.nextInt();
			for(int i=0; i<m; i++){
				a =Shuffle(a,sc.nextInt());
			}
		System.out.println(a);
		}
	}
	static String Shuffle(String a , int h){
		a =  a.substring(h,a.length()) + a.substring(0,h);
		return a;
	}

}