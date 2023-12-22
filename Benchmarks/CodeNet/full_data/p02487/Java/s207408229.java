import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int w, h;
			while((h = sc.nextInt()) != 0 && (w = sc.nextInt()) != 0){
				for(int i = 0; i < w; i++){
					System.out.print('#');
				}
				System.out.println();
				for(int i = 1; i < h - 1; i++){
					System.out.print('#');
					for(int j = 1; j < w - 1; j++){
						System.out.print('.');
					}
					System.out.print('#');
					System.out.println();
				}
				for(int i = 0; i < w; i++){
					System.out.print('#');
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}