
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		//スキャナーで半径rを読み取る
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    double r = Double.parseDouble(s1);
	    
	    //面積sと円周lを求め表示する
	    double s = Math.PI * r * r;
	    double l = Math.PI * (r + r);
	    
	    //Eを表示させないように少数点第6位で四捨五入する
	    int a = (int)(s * 1000000);
	    int b = a % 10;
	    if(b >= 5){
	    	a += 10;
	    }
	    s = ((double)a) / 1000000;
	    System.out.println(s + " " + l);
	    
		
	}

}