import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int H = scan.nextInt();
      	int W = scan.nextInt();
      	int h = scan.nextInt();
      	int w = scan.nextInt();
      	int all = H * W;
      	int nokori = all - h * W;
      	nokori = nokori - (H -h) * w;
      	System.out.print(nokori);
    }

}