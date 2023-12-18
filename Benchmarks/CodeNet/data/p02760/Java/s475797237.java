

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <3 ; j++) {
				int n = s.nextInt();
				if(n<1 && n>100) {
					return;
				}
				if(n!=0) {
					arr[i][j] = n;
				}else {
					arr[i][j] = Integer.MIN_VALUE;
				}
			}
		}
		
		int n = s.nextInt();
		if(n<1 && n>10){
			return;
		}
		ArrayList<Integer> arr1 = new ArrayList<>();;
		for(int i = 0; i<n; i++) {
			int z = s.nextInt();
			if(z>=1 && z<=100) {
				arr1.add(s.nextInt());
			}else {
				return;
			}
			
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arr1.contains(arr[i][j])) {
					arr[i][j] = 0;
				}
			}
		}
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(arr[i][i] ==0) {
				count ++;
			}
		}
		if(count == 3) {
			System.out.println("Yes");
			return;
		}else {
			count =0;
		}
		for(int i = 0, j =2; i < 3 && j>=0; i++, j--) {
			if(arr[i][i] ==0) {
				count ++;
			}
		}
		if(count == 3) {
			System.out.println("Yes");
			return;
		}else {
			count =0;
		}
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j<3; j++) {
				if(arr[i][j] ==0) {
					count ++;
				}
			}
			if(count == 3) {
				System.out.println("Yes");
				return;
			}else {
				count =0;
			}
			for(int j = 0; j<3; j++) {
				if(arr[j][i] ==0) {
					count ++;
				}
			}
			if(count == 3) {
				System.out.println("Yes");
				return;
			}else {
				count =0;
			}
		}
		


	}

}
