import java.util.Scanner;

public class Main {
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int[][] map = new int[26][2];
		for(int i = 0, j = 97; i < map.length; i++, j++) {
			map[i][0] = j;
		}
		outside : while(true) {
			char[] array = scan.next().toCharArray();
			for(int i = 0; i < array.length; i++) {
				if(array[i] == 46) break outside;
					
				int tmp = array[i] - 97;
				try {
					map[tmp][1]++;
					} catch(ArrayIndexOutOfBoundsException e) {
					map[tmp+32][1]++;
				} /*finally {
					System.out.println(array[i]);
				} */
			}
		}
		
		for(int i = 0; i < map.length; i++) {
			System.out.println((char)map[i][0] + " : " + map[i][1]);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
