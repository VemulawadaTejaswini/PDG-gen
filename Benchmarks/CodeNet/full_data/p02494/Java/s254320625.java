import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] hm = new int[10000];
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0)break;
			for(int i = 0; i < h; i++){
				for(int k=0; k < w; k++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}