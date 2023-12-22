import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	try {
		File File_Path = new File(args[0]);
		Scanner scan = new Scanner(File_Path);
		int n = scan.nextInt();
		String tmp1;
		int tmp2,i=0,j=0;
		int s[] = new int[13];
		int h[] = new int[13];
		int c[] = new int[13];
		int d[] = new int[13];
		while(i<n) {
			tmp1 = scan.next();
			tmp2 = scan.nextInt();
			if(tmp1.equals("S")) s[tmp2-1] = tmp2;
			if(tmp1.equals("H")) h[tmp2-1] = tmp2;
			if(tmp1.equals("C")) c[tmp2-1] = tmp2;
			if(tmp1.equals("D")) d[tmp2-1] = tmp2;
			i++;
		}

		for(j=0;j<13;j++) {
			if(s[j] == 0) System.out.println("S "+(j+1));
		}

		for(j=0;j<13;j++) {
			if(h[j] == 0) System.out.println("H "+(j+1));
		}
		
		for(j=0;j<13;j++) {
			if(c[j] == 0) System.out.println("C "+(j+1));
		}
		
		for(j=0;j<13;j++) {
			if(d[j] == 0) System.out.println("D "+(j+1));
		}
		scan.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

