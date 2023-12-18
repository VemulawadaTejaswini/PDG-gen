
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int h=scn.nextInt();
		int w=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int c1=0,c2=0,c3=0;
		for(int i=0;i<n;i++) {
			if(arr[i]<=h) {
				c1++;
			}else {
				if(arr[i]<w+1) {
					c2++;
				}else {
					c3++;
				}
			}
		}
		System.out.println(Math.min(c1, Math.min(c2, c3)));
	}

}
