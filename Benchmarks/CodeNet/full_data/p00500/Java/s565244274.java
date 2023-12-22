//package Uniquenumber;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag;
		int N = sc.nextInt();
		int[] point = new int[N];
		int[][] num = new int[N][3]; 
		for(int i = 0; i < N; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt(); 
			num[i][2] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < N; j++) {
				flag = true;
				for(int k = 0; k < N; k++) {
					if(num[j][i] == num[k][i] && j != k) flag = false;
				}
				if(flag) point[j] += num[j][i];
			}
		}
		for(int i = 0; i < N; i++) System.out.println(point[i]);
	}

}