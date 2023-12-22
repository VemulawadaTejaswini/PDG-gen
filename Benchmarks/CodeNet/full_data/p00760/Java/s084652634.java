import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++) {
				int y = sc.nextInt();
				int m = sc.nextInt();
				int d = sc.nextInt();
				int days = 0;
				
				for(int j=y+1; j<1000; j++) {
					if(j%3 == 0) {
						days += 200;
					}else {
						days += 5*19 + 5*20;
					}
				}
				for(int j=m+1; j<=10; j++) {
					if(y%3 == 0) {
						days += 20;
					}else {
						if(j == 1 ||j == 3 ||j == 5 ||j == 7 ||j == 9) {
							days += 20;
						}else {
							days += 19;
						}
					}
				}
				/*
				if(m == 1 ||m == 3 ||m == 5 ||m == 7 ||m == 9) {
					days += 20;
				}else if(m == 2 ||m == 4 ||m == 6 ||m == 8 ) {
					days += 19;
				}
				*/
				
				if(y%3 == 0) {
						days += 20 - d;
				}else {
					if(m == 1 ||m == 3 ||m == 5 ||m == 7 ||m == 9) {
						days += 20 - d;
					}else {
						days += 19 - d;
					}
				}
			
			System.out.println(days+1);
			
			
			}
			
				
		}
	}
}
