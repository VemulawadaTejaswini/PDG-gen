import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, m;
		char[][] table;
		char c;
		boolean bool;
		while((n = sc.nextInt()) != 0){
			table = new char[n][2];
			for(int i = 0; i < n; i++){
				table[i][0] = sc.next().charAt(0);
				table[i][1] = sc.next().charAt(0);
			}
			m = sc.nextInt();
			for(int i = 0; i < m; i++){
				c = sc.next().charAt(0);
				bool = true;
				for(int j = 0; j < n; j++){
					if(table[j][0] == c){
						bool = false;
						System.out.print(table[j][1]);
						break;
					}
				}
				if(bool){
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}