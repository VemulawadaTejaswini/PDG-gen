import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int l = stdIn.nextInt();
		
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		int index = 0;
		int [] apples = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			cnt += l+i;
			int abs = Math.abs(l+i);
			apples[i] = l+i;
			
			if(min > abs) {
				min = abs;
				index = i;
			}
			
		}
		
		System.out.println(cnt-apples[index]);
		
		
		
		
	}

}
