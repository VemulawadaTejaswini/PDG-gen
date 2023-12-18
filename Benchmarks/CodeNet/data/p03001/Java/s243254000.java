import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			int w_x, h_y, x, y;
			w_x = sc.nextInt();
			h_y = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			
			int minSq = w_x*h_y;
			int tmpSq = w_x*y;
			minSq = minSq - tmpSq;
			
			minSq = Math.min(minSq, tmpSq);
			
			int minSq2 = w_x*h_y;
			int tmpSq2 = x*h_y;
			minSq2 = minSq2 - tmpSq2;
			minSq2 = Math.min(minSq2, tmpSq2);
			
			int minSqMax = Math.max(minSq, minSq2);
			
			System.out.println(minSqMax);

			if (minSq == minSq2) System.out.println("1");
			else System.out.println("0");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
