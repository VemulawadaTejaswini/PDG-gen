import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static double xa1, ya1, xa2, ya2, xb1, yb1, xb2, yb2;
	
	public static void main(String[] args){
		while(read()){
			slove();
		}
	}
	static boolean read(){
		if(sc.hasNext() == false)
			return false;
		xa1 = sc.nextDouble();
		ya1 = sc.nextDouble();
		xa2 = sc.nextDouble();
		ya2 = sc.nextDouble();
		xb1 = sc.nextDouble();
		yb1 = sc.nextDouble();
		xb2 = sc.nextDouble();
		yb2 = sc.nextDouble();
		return true;
	}
	static void slove(){
		if(yb1 > ya2){
			System.out.println("NO");
		}else if(xb2 <xa1){
			System.out.println("NO");
		}else if(ya1 > yb2){
			System.out.println("NO");
		}else if(xb1 > xa2){
			System.out.println("NO");
		}else{
			System.out.println("YES");
		}
	}
}