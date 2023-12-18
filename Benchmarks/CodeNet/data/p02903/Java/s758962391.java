import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int val = 0;
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < h; i++) {
				
				for (int j = 0; j < w; j++) {
					
					if (i < b) {
					
						if ( j < a) {
							val = 0;
						}else {
							val = 1;
						}
						
						sb.append(val);
					
					
					
					}else if (i >= b) {
						
						if ( j < a) {
							val = 1;
						}else {
							val = 0;
						}
						sb.append(val);
					}
				}
				sb.append("\n");
			}
			
			System.out.println(sb);
		}
	}
}
