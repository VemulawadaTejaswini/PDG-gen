import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt(), r = scan.nextInt();
		int []i_mod=new int[r-l];
		for(int i=0,k=l;k<r;i++,k++){
			i_mod[i]=k%2019;
		}
		Arrays.sort(i_mod);
		System.out.println(i_mod[0]*i_mod[1]);
	}
}
