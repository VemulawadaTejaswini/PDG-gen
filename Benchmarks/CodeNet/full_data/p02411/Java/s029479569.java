import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		int m = 0;
		int f = 0;
		int r = 0;
		String ans = null;
		
		while(true){
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			if(m + f + r == -3){
				break;
			}
			if(m == -1 || f == -1){
				ans = "F";
			}else if(m + f >= 80){
				ans = "A";
			}else if(m + f >= 65){
				ans = "B";
			}else if(m + f >= 50){
				ans = "C";
			}else if(m+ f >= 30){
				if(r >= 50){
					ans = "C";
				}else{
					ans = "D";
				}
			}else if(m + f < 30){
				ans = "F";
			}
			System.out.println(ans);
		}
	}
}


