import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a = new int[9];
		for(int i=0 ; i<n;i++) {
			int x = stdIn.nextInt();
			switch(x/400) {
			case 0:a[0]++;	break;
			case 1:a[1]++;	break;
			case 2:a[2]++;	break;
			case 3:a[3]++;	break;
			case 4:a[4]++;	break;
			case 5:a[5]++;	break;
			case 6:a[6]++;	break;
			case 7:a[7]++;	break;
			case 8:a[8]++;	break;
			}
			if(x/400>8) {
				a[9]++;
			}
		}
		int i=0;
		int range = 0;
		while(i<9) {
			if(a[i++]>1) {
				range++;
			}
		}
		int min = range;
		int max = range + a[9];
		if(range==0) {
			min = 1;
			max = a[9];
		}
		System.out.println(min+" "+max);
	}
}
