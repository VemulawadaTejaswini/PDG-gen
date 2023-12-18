import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ary=sc.nextInt();
		int[] boxies=new int[ary];

		for(int i=0; i<ary; i++) {
			boxies[i]=sc.nextInt();
		}

		int kisu=0;
		int gusu=0;

		for(int i=1; i<ary; i+=2) {
			if(i==ary-1) {
				if(boxies[i]==boxies[i-1]) {
					gusu++;
				}
			}
			else {
				if(boxies[i-1]==boxies[i] || boxies[i+1]==boxies[i]) {
					gusu++;
				}
			}
		}

		for(int i=0; i<ary; i+=2) {
			if(i==ary-1) {
				if(boxies[i]==boxies[i-1]) {
					kisu++;
				}
			}

			else if(i==0) {
				if(boxies[i]==boxies[i+1]) {
					kisu++;
				}
			}
			else {
				if(boxies[i-1]==boxies[i] || boxies[i+1]==boxies[i]) {
					kisu++;
				}
			}
		}
		System.out.println(Math.min(kisu, gusu));
	}
}