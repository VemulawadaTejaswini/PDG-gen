import java.awt.geom.*;
import java.util.*;
public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			String abstr = ("" + ((double)a / b));
			String [] ab =  abstr.split("\\.");
			int sum = 0;
			int len = Math.min(n, ab[1].length());
			for(int i = 0; i < len; i++){
				sum += ab[1].charAt(i) - '0';
			}
			System.out.println(sum);
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}