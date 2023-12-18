import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int H = scan.nextInt();
	int W = scan.nextInt();
	int h = scan.nextInt();
	int w = scan.nextInt();

	int black = H*W;
	int white = H*w+W*h-h*w;
	System.out.println(black-white);
    }
}
