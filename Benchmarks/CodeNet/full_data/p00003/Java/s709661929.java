package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] a) throws NumberFormatException, IOException{
		int arr[]={0,0,0};
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int no = Integer.parseInt(br.readLine());
			if(no < 1000) {
				StringTokenizer tkn = new StringTokenizer(br.readLine());
				for(int i=0;i<3;i++) {
					arr[i] = Integer.parseInt(tkn.nextToken());
				}
				Arrays.sort(arr);
				isRightTriangle(arr);
			}
		
    }
	
	public static void isRightTriangle(int a[]) {
			int hyp = a[2];
			if(hyp !=0 && a[0] != 0 && a[1] != 0) {
				if(((a[0]*a[0]) + (a[1]*a[1])) == (hyp*hyp)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
	}

}