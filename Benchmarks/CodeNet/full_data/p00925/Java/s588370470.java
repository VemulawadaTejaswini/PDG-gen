import java.util.Iterator;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		long ans = sc.nextInt();
		long a = 0,b=0;
		
		// for a
		String[] ss =s.split("\\+");
		for(int i = 0;i<ss.length;i++){
			String sp[] = ss[i].split("\\*");
			long z = 1;
			for(String t:sp){
				int x = Integer.parseInt(t);
				z = z * x;
			}
			a += z;
		}
		
		b = s.charAt(0)-'0';
		// for b
		for(int i=1;i<s.length();i+=2){
			int num = s.charAt(i+1)-'0';
			if(s.charAt(i)=='+'){
				b = b + num;
			} else {
				b = b * num;
			}
		}
		if(a==b && a==ans){
			System.out.println("U");
		} else if((a!=ans && b!=ans)){
			System.out.println("I");
		} else if(a==ans){
			System.out.println("M");
		} else if(b==ans){
			System.out.println("L");
		}
		
	}

}