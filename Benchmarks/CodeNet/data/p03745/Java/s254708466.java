import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String [] array = br.readLine().split(" ");
		int result = 1;
		boolean continueFlag = true;
		long x1=0;
		long x2=0;
		long sa = 0;
		boolean plusFlag = false;
		boolean minusFlag = false;
		if(count != 1) {
				sa=Long.parseLong(array[1]) -  Long.parseLong(array[0]);
				if(sa > 0) {
					plusFlag = true;
				}else {
					minusFlag = true;
				}
			for(int i=1; i<count-1 ;i++) {
				x1 = Long.parseLong(array[i]);
				x2 = Long.parseLong(array[i+1]);
				long xx = x2-x1;
				if(!continueFlag) {
					if(xx > 0) {
						plusFlag = true;
						minusFlag = false;
					}else {
						plusFlag = false;
						minusFlag = true;
					}
					continueFlag = true;
				}
				if(xx != 0 && ( (plusFlag && xx < 0) || (minusFlag && xx > 0))) {
					result++;
					continueFlag = false;
				/*	if(!continueFlag) {
						sa = xx;
						continueFlag = true;
					}else if(sa != xx) {
						if(sa != 0) {
							result++;
							continueFlag = false;
						}else {
							sa = xx;
						}

					}*/
				}
			}
		}
		System.out.println(result);
	}
}