import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
        int[] h = new int[num];
		for (int i = 0; i < num; i++) {
            h[i] = in.nextInt();
        }
		in.close();
      
        int max = h[0];
		int count = 1;
		for(int i = 1; i < num; i++) {
			if (max < h[i]) {
                max = h[i];
                count++;
            } else if (max == h[i]) {
                count++;
            }
		}
        System.out.println(count);
	}
}
