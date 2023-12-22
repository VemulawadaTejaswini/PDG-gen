import java.util.Scanner;


public class Main {

	static int H,W;
	static int[][]map;
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		while(read())	solve();
	}
	
	public static boolean read() {
		String s;
		String[] str = new String[2];
		if(sc.hasNext()) {
			s = sc.nextLine();
			str = s.split(" ");
			W = Integer.parseInt(str[0]);
			H = Integer.parseInt(str[1]);
		}
		if ((W==0)||(H==0)) return false;
		
		map = new int[W][H];	//初期化
		for(int i=0 ; i<W ; i++) {
			s = sc.nextLine();
			for(int j=0 ; j<H ; j++) {
				// < 1
				// ^ 2
				// > 3
				// v 4
				switch(s.charAt(j)) {
				case '<':
					map[i][j] = 1;
					break;
				case '^':
					map[i][j] = 2;
					break;
				case '>':
					map[i][j] = 3;
					break;
				case 'v':
					map[i][j] = 4;
					break;
				case '.':
					map[i][j] = 0;
					break;
				default:
					break;
					//System.exit(2);
				}
			}
		}
		return true;
	}
	public static void solve() {
		int x=0,y=0;
		for(int i=0; i<W*H ; i++) {
			if((x<0||x>W)||(y<0||y>H)) {
				System.out.println("LOOP");
				return;
			}
			switch(map[x][y]) {
			case 1:
				y--;
				break;
			case 2:
				x--;
				break;
			case 3:
				y++;
				break;
			case 4:
				x++;
				break;
			case 0:
				System.out.println(y + " " + x);
				//System.out.println("i=" + i);
				return;
			default:
				return;
			}
		}
		System.out.println("LOOP");
		return;
	}

}