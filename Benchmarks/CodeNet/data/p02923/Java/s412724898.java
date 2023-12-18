import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scanner.nextLine());
			String[] str = scanner.nextLine().split(" ");
			int[] array = new int[n];
			for(int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(str[i]);
			}
			System.out.println(lower(n, array));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		


	}
	
	public static int lower(int n, int[] columns) {
		int cnt = 0;
		int max = 0;
		for(int i = 0; i < n - 1; i++) {
			if(columns[i] >= columns[i + 1]) {
				cnt++;
			}else {
				if(max < cnt) {
					max = cnt;
				}
				cnt = 0;
			}
			if(max < cnt) {
				max = cnt;
			}
		}
		return max;
	}

}
