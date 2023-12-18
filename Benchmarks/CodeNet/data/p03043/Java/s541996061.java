import java.util.Scanner;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		String[] array = string.split(" ");
		Double[] array2 = new Double[2];
		for(int i=0; i<array.length; i++) {
				array2[i] = Double.parseDouble(array[i]);
		}
		Double[] r = new Double[]{1.0,2.0,4.0,8.0,16.0,32.0,64.0,128.0,256.0,512.0,1024.0,2048.0,4096.0,8192.0,16384.0,32768.0,65536.0};
		double ans = 0.0;
		for(int i=0; i<array2[0];i++) {
			Double a = array2[1] / (Double.parseDouble(String.valueOf(i))+1.0);
			int b = 17;
			for(int j=0; j<17; j++) {
				if(r[j] >= a) {
					b=j;
					break;
				}
			}
			ans += (1.0/array2[0])*(Math.pow(0.5,b));
		}
		System.out.println(ans);
	}

}
