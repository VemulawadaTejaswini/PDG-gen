


import java.util.Scanner;

class Main{
	public static void main(String[] ag) {
		Scanner sc=new Scanner(System.in);
		int kosu=sc.nextInt();
		long[] a=new long[kosu];
		long max=1;
		for(int i=0; i<kosu; i++) {
			a[i]=sc.nextLong();
			if(a[i]>max) {
				max=a[i];
			}
		}

		boolean warikiri=true;
		int counter=1;
		while(true) {
			warikiri=true;
			for(int i=0; i<kosu; i++) {
				if(max*counter%a[i]!=0) {
					warikiri=false;
					break;
				}
			}

			if(warikiri==true) {
				System.out.println(counter*max);
				break;
			}

			counter++;
		}
	}
}