//import java.io.File;
import java.util.Scanner;

class Main{
	static int[] powArr = new int[12];

	public static void main(String[] args) {
		for(int i = 0; i < powArr.length; i++) {
			powArr[i] = pow4(i);
		}
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);

		int mesLength = scan.nextInt();
		int[] arr = new int[mesLength];
		int ite = 0;

		for(int i = 0; i < mesLength; i++) {
			String _s = scan.next();
			if(_s.equals("insert")) {
				arr[ite] = change(scan.next());
				ite++;
			}else if(_s.equals("find")) {
				boolean flag = false;
				int num = change(scan.next());
				for(int j = 0; j < ite; j++) {
					if(arr[j] == num) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}

		System.out.println(-60+(int)'A');
		System.out.println(-60+(int)'C');
		System.out.println(-60+(int)'G');
		System.out.println(-60+(int)'T');
		

}catch(Exception e) {
	e.printStackTrace();
}
	}

	public static int change(String _s) {
		int sum = 0;
		char[] arr = _s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
/*
			switch(arr[i]) {
				case 'A':
					sum += 1*pow4(i);
					break;
				case 'C':
					sum += 2*pow4(i);
					break;
				case 'G':
					sum += 3*pow4(i);
					break;
				case 'T':
					sum += 4*pow4(i);
					break;
			}
*/
			sum += arr[i]*powArr[i];
		}
		return sum;
	}

	public static int pow4(int _i) {
		if(_i>0) return pow4(_i-1)*4;
		else return 1;
	}
}