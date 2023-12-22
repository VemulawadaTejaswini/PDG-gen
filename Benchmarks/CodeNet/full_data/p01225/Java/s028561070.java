import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		for( int i = 0; i < n; i++ ){
			int[] num = new int[9];	//?????????????????????
			char[] color = new char[9];	//??????????????????
			boolean[] left = new boolean[9];	//???????????§???????????????????????£?????????????????????
			for( int j = 0; j < 9; j++ ){
				num[j] = Integer.parseInt(scan.next());
			}
			for( int j = 0; j < 9; j++ ){
				String temp = scan.next();
				color[j] = temp.charAt(0);
			}
			for( int j = 0; j < 9; j++ ){
				left[j] = true;
			}
			System.out.println(Check(num, color, left));
		}
		return;
	}
	
	public static int Check(int num[], char color[], boolean left[]){
		int count = 0;
		int re = 0;
		for( int i = 0; i < 9; i++ ){
			if( left[i] ){
				count++;
			}
		}
		if( count == 0 ){
			return 1;
		}
		for( int i = 0; i < 9; i++ ){
			for( int j = i+1; j< 9; j++ ){
				for( int k = j+1; k < 9; k++ ){
					if( left[i]  && left[j] && left[k] ){
						if( color[i] == color[j] && color[j] == color[k] ){
							//??¨?????????????????????????????????
							if( CheckSN(num[i], num[j], num[k]) || (num[i] == num[j] && num[j] == num[k]) ){
								left[i] = left[j] = left[k] = false;
								if( Check(num, color, left) > 0 ){
									return 1;
								}
								left[i] = left[j] = left[k] = true;
							}
						}
					}
				}
			}
		}
		
		return 0;
	}
	
	public static boolean CheckSN(int a, int b, int c){
		//????????????????????£???????¢?????????????
		int temp = 0;
		for( int i = 0; i < 2; i++ ){
			if( a > b ){
				temp = a;
				a = b;
				b = temp;
			}
			if( b > c ){
				temp = b;
				b = c;
				c = temp;
			}
		}
		if( a == b-1 && b == c-1 ){
			return true;
		}
		return false;
	}
}