import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	class a implements Comparable{
		int i;
		a(int p){
			i = p;
		}
		public int compareTo(Object arg0) {
			return ((a)arg0).i - this.i;
		}
	}
	void run(){
		a[] d = new a[5];
		for(int i= 0 ; i < 5 ; i++){
			d[i] = new a(sc.nextInt());
		}
		Arrays.sort(d);
		for(int i= 0 ; i < 5 ; i++){
			System.out.print(d[i].i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
		
	}
}