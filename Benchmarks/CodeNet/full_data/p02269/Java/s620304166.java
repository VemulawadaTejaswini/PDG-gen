//import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
try{
		//Scanner scan = new Scanner(new File("in.txt"));
		Scanner scan = new Scanner(System.in);

		int mesLength = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < mesLength; i++) {
			String _s = scan.next();
			if(_s.equals("insert")) {
				arr.add(change(scan.next()));
			}else if(_s.equals("find")) {
				if(arr.contains(change(scan.next()))) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}
		

}catch(Exception e) {
	e.printStackTrace();
}
	}

	public static int change(String _s) {
		int sum = 0;
		char[] arr = _s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
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
		}
		return sum;
	}

	public static int pow4(int _i) {
		if(_i>0) return pow4(_i-1)*4;
		else return 1;
	}
}