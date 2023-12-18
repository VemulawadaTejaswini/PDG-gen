import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] a = new String[H + 2];
		for(int i = 1; i < H + 1; i++) {		
                a[i] = sc.next();				
			
		 }
		for(int i = 0; i < H + 2; i++) {
			System.out.print("#");
				if(i == 0 || i == H + 1 ) {
					for(int j = 0; j < W; j++) {
					    System.out.print("#");
					}
				}else System.out.print(a[i]);
                System.out.println("#");
		}
	}
}
