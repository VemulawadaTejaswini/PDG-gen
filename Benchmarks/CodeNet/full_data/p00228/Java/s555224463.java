import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] disp = 
			{
				"0111111",
				"0000110",
				"1011011",
				"1011111",
				"1100110",
				"1101101",
				"1111101",
				"0100111",
				"1111111",
				"1101111",
				"0000000"
			};
		
		int[] disp_b = new int[11];
		
		for(int i = 0; i < 11; i++){
			disp_b[i] = Integer.parseInt(disp[i] , 2);
		}
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == -1){
				break;
			}
			
			int cur = 10;
			
			for(int i = 0; i < n; i++){
				int next = sc.nextInt();
				String str = Integer.toString(disp_b[cur] ^ disp_b[next], 2);
				if(str.length() != 7){
					StringBuilder b = new StringBuilder();
					for(int j = 0; j < 7 - str.length(); j++){
						b.append("0");
					}
					b.append(str);
					str = b.toString();
				}
				System.out.println(str);
				cur = next;
			}
			
		}
	}

}