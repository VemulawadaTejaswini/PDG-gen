import java.util.*;

public class Main {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] strr = str.split(" ");
		int[] num = new int[strr.length];
		for(int i = 0;i<strr.length;i++)
			num[i] = Integer.parseInt(strr[i]);
		int max = num[0]*num[2];
		if(num[0]*num[3]>num[0]*num[2])
			max = num[0]*num[3];
		if(num[1]*num[2]>num[0]*num[2])
			max = num[1]*num[2];
		if(num[0]*num[3]>num[0]*num[2])
			max = num[0]*num[3];
		System.out.println(max);
		scan.close();
	}
}
