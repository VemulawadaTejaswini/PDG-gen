import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String result = "Yes";
		int n = s.nextInt();
		int[] h = new int[n];
		for(int i=0;i<n;i++) {
			h[i]=s.nextInt();
			
		}
		for(int i =0;i<n-1;i++) {
			if(h[i]>(h[i+1]+1)) {
				result="No";
				break;
			}
		}
		
		System.out.println(result);
		}
		
		
			
		
	}

