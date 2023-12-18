import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] pic = new String[h];
		for(int i = 0; i < h; i++){
			pic[i] = sc.next();
		}
		
		//char[][] pic_ = new char[2 * h][w];
		for(int i = 0; i < h; i++){
			System.out.println(pic[i]);
			System.out.println(pic[i]);
		}
		
		sc.close();
	}

}
