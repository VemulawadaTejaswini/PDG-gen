import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String w_str = scanner.next();
		String h_str = scanner.next();
		String x_str = scanner.next();
		String y_str = scanner.next();
		String r_str = scanner.next();

		int w = Integer.parseInt(w_str);
		int h = Integer.parseInt(h_str);
		int x = Integer.parseInt(x_str);
		int y = Integer.parseInt(y_str);
		int r = Integer.parseInt(r_str);

		if((x-r) < 0 || (x+r) > w || (y-r) < 0 || (y+r) > h) {
			System.out.println("No");
		}
		if((x-r) >= 0 && (x+r) <= w && (y-r) >= 0 && (y+r) <= h) {
			System.out.println("Yes");
		}

    	scanner.close();
    }
}
