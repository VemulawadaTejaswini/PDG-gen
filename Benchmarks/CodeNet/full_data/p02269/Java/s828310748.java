import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	static int[] powArr = new int[12];

	public static void main(String[] args) {
		for(int i = 0; i < powArr.length; i++) {
			powArr[i] = pow4(i);
		}

try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int mesLength = Integer.parseInt(br.readLine());
		int[] arr = new int[mesLength];
		int ite = 0;

		for(int i = 0; i < mesLength; i++) {
			String _s = br.readLine();
			if(_s.startsWith("i")) {
				arr[ite] = change(_s.substring(7));
				ite++;
			}else if(_s.startsWith("f")) {
				boolean flag = false;
				int num = change(_s.substring(5));
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
					sum += 1*powArr[i];
					break;
				case 'C':
					sum += 2*powArr[i];
					break;
				case 'G':
					sum += 3*powArr[i];
					break;
				case 'T':
					sum += 4*powArr[i];
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