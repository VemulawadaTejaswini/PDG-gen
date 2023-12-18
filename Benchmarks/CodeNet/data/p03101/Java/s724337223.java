import java.util.*;

public class Sample {
  	public static void main(String... args) {
      	Scanner sc = new Scanner(System.in);
      	int H = sc.nextInt();
      	int W = sc.nextInt();
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	System.out.println(H*W - H*w - h*W + h*w);
    }
}