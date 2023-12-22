import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] row = new int[sc.nextInt()];
		for(int i = 0; i < row.length; i++){
			row[i] = i + 1;
		}
		int ctimes = sc.nextInt();
	
		sc.nextLine();
		for(int j = 0; j < ctimes; j++){
			int[] ch = new int[2];
			String[] s = sc.nextLine().split(",");
			ch[0] = Integer.parseInt(s[0]) -1;
			ch[1] = Integer.parseInt(s[1]) -1;
			
			int temp = row[ch[0]];
			row[ch[0]] = row[ch[1]];
			row[ch[1]] = temp;
		}

		for(int i = 0; i < row.length; i++){
			System.out.println(row[i]);
		}
	}
}