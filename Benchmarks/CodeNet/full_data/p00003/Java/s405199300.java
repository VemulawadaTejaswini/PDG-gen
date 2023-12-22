import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roop = Integer.parseInt(sc.nextLine());
		for(int i=0; i<roop; i++) {
			Triangle tri = new Triangle(sc.nextLine().split(" "));
			tri.execute();
		}
	}
}

class Triangle {
	private int a;
	private int b;
	private int c;
	public Triangle(String[] nums) {
		a = Integer.parseInt(nums[0]);
		a *= a;
		b = Integer.parseInt(nums[1]);
		b *= b;
		c = Integer.parseInt(nums[2]);
		c *= c;
	}
	
	public void execute() {
		int biggest = biggest();
		String result = "";
		if(biggest == 0) {
			result = sumNum(this.b, this.c, this.a);
		} else if(biggest == 1) {
			result = sumNum(this.a, this.c, this.b);
		} else if(biggest == 2) {
			result = sumNum(this.a, this.b, this.c);
		}
		System.out.println(result);
	}
	
	private int biggest() {
		int result = Math.max(c, Math.max(a, b));
		if(result == a) {
			return 0;
		} else if(result == b) {
			return 1;
		} else if(result == c) {
			return 2;
		} else {
			return 3;
		}
	}
	
	private String sumNum(int a, int b, int c) {
		String result = "";
		if(c == a + b) {
			result = "YES";
		} else {
			result = "NO";
		}
		return result;
	}
}