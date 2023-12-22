import java.util.Scanner;

public class Main {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);

	int h = in.nextInt();
	int w = in.nextInt();
	String s;

	while (!(h ==0 && w == 0)){
		StringBuffer sb = new StringBuffer(w);
		for (int i = 0; i < w; i++) {
                        sb.append("#");
                }
		for (int i = 0; i < h; i++) {
			System.out.println(sb.toString());
		}
		h = in.nextInt();
		w = in.nextInt();
                System.out.println();
	}	
    }   
}