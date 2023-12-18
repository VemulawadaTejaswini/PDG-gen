import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		void doIt(){
			int n = sc.nextInt();
			long a[] = new long[n];
			long b[] = new long[n];
			for(int i = 0;i < n;i++){
				a[i] = sc.nextLong();
				b[i] = sc.nextLong();
			}
			long num = 0;
			for(int i = n - 1;i >= 0;i--){
				if(b[i] > 1)num = num +  b[i] - ((a[i] + num) % b[i]);
			}
			System.out.println(num);
		}
	}
}
