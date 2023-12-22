import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] list = new int[1000000];
		
		while(scanner.hasNext()) {
			int size = scanner.nextInt();
			if (size == 0) return;
			
			for(int i = 0; i < size; i++) {
				list[i] = scanner.nextInt();
			}
			
			int count = 0;
			
			for(int i = 0; i < size / 2; i++) {
				count = 1;
				for(int k = i + 1; k < size; k++) {
					if (list[i] == list[k]) {
						count++;
					}
				}
				if (count > size / 2) {
					System.out.println(list[i]);
					break;
				}
			}
			if (count <= size / 2) {
				System.out.println("NO COLOR");
			}
		}
	}
}