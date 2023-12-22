import java.util.Scanner;

public class Main {
	public void change() {

	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = 60;
        int H = 40;
        int x = 30;
        int y = -50;
        int r = 3;
        
        if((x + r <= W && y + r <= H) && (x - r > 0 && y - r > 0)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
    }
}
