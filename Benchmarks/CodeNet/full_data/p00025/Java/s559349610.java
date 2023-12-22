import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[] a = new int[4];
			int[] b = new int[4];
			for(int i = 0; i < a.length; i++) a[i] = sc.nextInt();
			for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();
			System.out.println(hit(a, b) + " " + blow(a, b));
		}
		sc.close();
	}
	
	static int blow(int[] q, int[] a) {
		int result = 0;
		for(int i: a) {
			if(contains(q, i)) result++;
		}
		result -= hit(q, a);
		return result;
	}
	
	static int hit(int[] q, int[] a) {
		int result = 0;
		for(int i = 0; i < q.length; i++) {
			if(q[i] == a[i]) result++;
		}
		return result;
	}
	
	static boolean contains(int[] q, int a) {
		for(int i: q) {
			if(i == a) return true;
		}
		return false;
	}
}