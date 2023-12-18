import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String[] array = string.split(" ");
		int[] array2 = new int[2];
		for(int i=0; i<array.length; i++) {
				array2[i] = Integer.parseInt(array[i]);
		}
		int[] r = new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536};
		double ans = 0.0;
		for(int i=0; i<array2[0];i++) {
			int a = array2[1] / (i+1);
			int b = 17;
			for(int j=0; j<17; j++) {
				if(r[j] > a) {
					b=j;
					break;
				}
			}
			ans += (1/array2[0])*(Math.pow(0.5,b));
		}
	}

}
