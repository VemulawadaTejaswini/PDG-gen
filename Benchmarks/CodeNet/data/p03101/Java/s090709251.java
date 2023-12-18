import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        int H = stdIn.nextInt();
	int W = stdIn.nextInt();
	int h = stdIn.nextInt();
	int w = stdIn.nextInt();
	System.out.println((H-h)*(W-w));
    }
}
