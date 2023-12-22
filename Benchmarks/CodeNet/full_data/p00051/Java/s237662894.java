import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	void run() {
		int[] value = new int[8];
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			for(int j=0;j<8;j++) {
				value[j] = (int) (str.charAt(j) - '0');
			}
			Arrays.sort(value);
			System.out.println(max(value) - min(value));
		}
		
	}
	int min(int[] value) {
		String max = "";
		for (int i: value) max += i;
		return Integer.parseInt(max);
	}
	
	int max(int[] value) {
		String min = "";
		for (int i=7;i>=0;i--) min += value[i];
		return Integer.parseInt(min);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}