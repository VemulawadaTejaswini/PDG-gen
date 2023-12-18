import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double result = (double)(w * h);
        result = result / 2;
        if (w == h && x == w / 2 && w % 2 == 0 && y == h / 2 && h % 2 == 0) {
            System.out.println(result + " " + 1);
        } else {
            System.out.println(result + " " + 0);
        }
	}
}