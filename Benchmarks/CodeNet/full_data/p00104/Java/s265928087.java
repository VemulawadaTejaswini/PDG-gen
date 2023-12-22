import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner(System.in);

	static char[][] field;
	static int x, y;
	static int m, n;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		while(read()){
			solve();
		}
		
	}
	
	static boolean read(){
		
		y = sc.nextInt();
		x = sc.nextInt();
		
		if(x == 0 || y == 0) return false;
		
		field = new char[y][x];
		
		for(int i=0; i < field.length; i++)
		{
			field[i] = sc.next().toCharArray();
		}
		
		return true;
	}
	
	static void solve(){
		m= 0;
		n=0;
		while(field[m][n] != '.'){

			if(field[m][n] == '<' ){
				field[m][n] = '*';
				n--;
			}
			else if(field[m][n] == '>' ){
				field[m][n] = '*';
				n++;
			}
			else if(field[m][n] == '^' ){
				field[m][n] = '*';
				m--;
			}
			else if(field[m][n] == 'v'){
				field[m][n] = '*';
				m++;
			}
			else if(field[m][n] == '*'){
				System.out.println("LOOP");
				return;
			}

		}
		
		System.out.println(n + " " + m);
	}

}