import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input_N = Integer.parseInt(sc.next());
 
        // programming
        int max_h = -1;
        int max_h_x = -1;
        int max_h_y = -1;
        int max_h_count = 0;
        for (int i = 0; i < input_N; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            int h = Integer.parseInt(sc.next());

            if (h > max_h) {
                max_h = h;
                max_h_x = x;
                max_h_y = y;
            }
            if (max_h == h) {
                max_h_count++;
            }
        }

        if (max_h_x == 0 && max_h_y == 0) {
            System.out.println(max_h_x + " " + max_h_y + " " + max_h);
        } else {
            System.out.println(max_h_x + " " + max_h_y + " " + max_h);
        }
	}
}