import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int h, w;
		h = sc.nextInt();
		w = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < h; i++){
			for(int j = 0; j < w; j++){
				char x = sc.next().charAt(0);
				if(x == '#'){
					count++;
				}
			}
		}
		System.out.println((h * w) - count - (h + w - 1));
	}
}
