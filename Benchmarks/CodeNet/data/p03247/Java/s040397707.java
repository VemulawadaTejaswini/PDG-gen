

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		int rmd = -1;
		for (int i=0;i<n;i++) {
			if (rmd == -1) {
				rmd = ((x[i]+y[i])%2+2)%2;
			} else if (rmd != ((x[i]+y[i])%2+2)%2){
				System.out.println(-1);
				return;
			}
		}
		
		
		if (rmd == 0) {
			System.out.println(20);
			
			for (int i=0;i<19;i++) {
				System.out.print("1 ");
			}
			System.out.println("1");
			for (int i=0;i<n;i++) {
				for (int j=0;j<x[i];j++) {
					System.out.print("R");
				}
				for (int j=0;j<-x[i];j++) {
					System.out.print("L");
				}
				for (int j=0;j<y[i];j++) {
					System.out.print("U");
				}
				for (int j=0;j<-y[i];j++) {
					System.out.print("D");
				}
				for (int j=0;j<(20-Math.abs(x[i])-Math.abs(y[i]))/2;j++) {
					System.out.print("UD");
				}
				System.out.println("");
			}
		} else {
			System.out.println(19);
			
			for (int i=0;i<18;i++) {
				System.out.print("1 ");
			}
			System.out.println("1");
			for (int i=0;i<n;i++) {
				for (int j=0;j<x[i];j++) {
					System.out.print("R");
				}
				for (int j=0;j<-x[i];j++) {
					System.out.print("L");
				}
				for (int j=0;j<y[i];j++) {
					System.out.print("U");
				}
				for (int j=0;j<-y[i];j++) {
					System.out.print("D");
				}
				for (int j=0;j<(19-Math.abs(x[i])-Math.abs(y[i]))/2;j++) {
					System.out.print("UD");
				}
				System.out.println("");
			}
		}
	}




}


