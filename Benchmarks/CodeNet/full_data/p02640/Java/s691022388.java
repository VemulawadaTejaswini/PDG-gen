

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int x,y;
		x = scan.nextInt();
		y = scan.nextInt();
		
		boolean isExist = false;
		
		//	鶴がi匹のとき、亀はx-i匹
		for(int i=0;i<=x;i++) {
			if(((i*2)+((x-i)*4) == y)){
				isExist = true;
			}
		}
		
		if(isExist) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
