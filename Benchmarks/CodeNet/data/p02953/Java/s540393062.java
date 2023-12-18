import java.util.*;

public class Main {
	static boolean [] changed;
	static boolean end = false;
	static int array[];
	static String ans = "Yes";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		changed = new boolean[n];
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			changed[i] = false;
			}
		while(!end){
			end = solved(n);
		}
		System.out.println(ans);
		
	}
	
	public static boolean solved(int n) {
		boolean check = true;
		for (int i = 0; i < n-1; i++) {
			if(array[i]>array[i+1]){
				check = false;
				if(changed[i]){
					ans = "No";
					return true;
				}else{
					array[i] = array[i]-1;
					changed[i] = true;
				}
			}
		}
		return check;
	}
}
