import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		int h = input.nextInt();
		while(w != 0 && h != 0){
		    for(int i = 0; i < w; i ++){
		        for(int j = 0; j < h; j ++)
		            System.out.print("#");
		        System.out.println();
		    }
		    System.out.println();
		    w = input.nextInt();
		    h = input.nextInt();
		}
	}
}
