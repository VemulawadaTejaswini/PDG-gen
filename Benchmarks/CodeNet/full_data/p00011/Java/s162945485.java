import java.util.*;

public class Main{

	public static void main(String[] args) {
		scan();
		
	}
	//??\????°???¨??¢??°
	public static void scan() {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\s*,\\s*|\n");
		int W = scanner.nextInt();
		int[] amida = Amida(W);
		int N = scanner.nextInt();
		int kari1 = 0;
		int kari2 = 0;
		int kari3 = 0;
		for(int i = 0; i < N ; i++){
			kari1 = scanner.nextInt();
			kari2 = scanner.nextInt();
			kari3 = amida[kari1-1];
			amida[kari1-1] = amida[kari2-1];
			amida[kari2-1] = kari3;
		}
		for(int i = 0; i < W ; i++){
			System.out.println(amida[i]);
		}
		scanner.close();
		return ;
	}
	
	public static int[] Amida(int W) {
		int[] amida = new int[W];
		for(int i = 0; i < W ; i++){
			amida[i] = i+1;
		}
		return amida;
	}
	
	
}