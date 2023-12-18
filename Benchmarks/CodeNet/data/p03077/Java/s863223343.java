
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int COUNT = 5;
		long array[]= new long[COUNT];
		long ride[] = new long[COUNT];
		long time = 0;
		
		long human = sc.nextLong();
		long moved = 0;
		
		ride[0] = human;
		for (int i = 0; i < COUNT; i++) {
			array[i] = sc.nextLong();
		}
		
		
		while(moved != human) {
			for (int i = COUNT - 1; i >= 0; i--) {
				if (ride[i] != 0) {
					long moving = 0; // 移動可能数
					

					if (i == COUNT - 1) {
						
						moving = Math.min(array[i] , ride[i]);
						moved +=moving;
						ride[i] -= moving;
					} else {
						// 移動先の余剰分
						moving = Math.min(array[i] , ride[i]);
						ride[i + 1] += moving;
						ride[i] -= moving;
					}
				}
			}
			time++;
		}
		
		System.out.println(time);
	}
}