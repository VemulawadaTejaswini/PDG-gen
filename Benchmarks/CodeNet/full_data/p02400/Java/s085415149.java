
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		//スキャナーで半径rを読み取る
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    int r = Integer.parseInt(s1);
	    
	    //面積sと円周lを求め表示する
	    double s = Math.PI * r * r;
	    double l = Math.PI * (r + r);
	    System.out.println(s + " " + l);
	    
		
	}

}