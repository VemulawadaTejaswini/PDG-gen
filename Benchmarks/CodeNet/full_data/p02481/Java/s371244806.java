//½Ä a cm æ± b cm Ì·û`ÌÊÏÆüÌ·³ðßévOðì¬µÄº³¢B
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		//aÆbðÇÝÝ
		int a = sc.nextInt();
		int b = sc.nextInt();
		//ÊÏÆüÌ·³ðoÍ
		System.out.println(a*b + " " + 2*(a+b));
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}