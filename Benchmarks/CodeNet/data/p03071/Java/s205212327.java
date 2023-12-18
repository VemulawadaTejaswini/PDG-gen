import java.util.*;
public class Main {

	static int a,b,total;

	public static void main(String[] args){
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		total=0;

		push();
		push();

		System.out.println(total);
	}

	public static void push() {
		if(a>=b) {
			total+=a;
			a--;
		}else {
			total+=b;
			b--;
		}
	}
}