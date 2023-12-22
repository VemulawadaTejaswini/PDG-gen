
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/*
2
10 11
11 12
2
N 2
E 1
	 * */
/*
3
0 15
5 10
5 15
5
W 10
S 10
N 20
E 10
S 10

 */
	
	
	public static int num = 0;

	public static int robotX;
	public static int robotY;

	public static boolean endFlag = false;
	public static boolean pickFlag = true;

	public static boolean[][] area = new boolean[21][21];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		while(true) {
		inputStone();
		if(endFlag) {
			break;
		}
	
		robotWalk();
		
		if(countStone()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		}
		
	}
	
	public static void walkOne() {
		area[robotX][robotY] = false;
	}
	
	public static void robotWalk() throws IOException {
		robotX=10;
		robotY=10;
		
		walkOne();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());
		

		for (int j = 0; j < num; j++) {
		String str[] = br.readLine().split(" ");
		
		if(str[0].equals("N")) {
			for(int i=0; i<Integer.parseInt(str[1]);i++) {
				robotY++;
				walkOne();
			}
		}//if
		
		if(str[0].equals("S")) {
			for(int i=0; i<Integer.parseInt(str[1]);i++) {
				robotY--;
				walkOne();
			}
		}//if
		
		
		if(str[0].equals("E")) {
			for(int i=0; i<Integer.parseInt(str[1]);i++) {
				robotX++;
				walkOne();
			}
		}//if
		
		
		if(str[0].equals("W")) {
			for(int i=0; i<Integer.parseInt(str[1]);i++) {
				robotX--;
				walkOne();
			}
		}//if
	}
	}
	public static void inputStone() throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		if (num == 0) {
			endFlag = true;
			return;
		}

		for (int i = 0; i < num; i++) {
			String str[] = br.readLine().split(" ");
			area[Integer.parseInt(str[0])][Integer.parseInt(str[1])] = true;
		}

	}
	
	//配列areaに一つでもtrueがあるとfalse
	public static boolean countStone() {
		
		for(int i=0; i<21; i++) {
			for(int j=0; j<21; j++) {
				if(area[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}

