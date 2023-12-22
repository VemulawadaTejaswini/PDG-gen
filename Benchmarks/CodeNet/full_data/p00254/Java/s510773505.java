import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N;
		Number num;
		int count;
		
		for(;;) {
			N = sc.next();
			if(N.equals("0000")) {
				break;
			}
			num = new Number(N);
			count = num.getCount();
			if(count == -1) {
				System.out.println("NA");
			} else {
				System.out.println(count);
			}
		}
	}
}

class Number {
	private int L,S,count;
	private String N;
	private String[] nums;
	
	public Number(String n) {
		N = n;
		switch(N.length()) {
		case 1:
			N = "000" + N;
			break;
		case 2:
			N = "00" + N;
			break;
		case 3:
			N = "0" + N;
			break;
		}
		count = 0;
		nums = new String[4];
	}
	
	private void setMin() {
		String tmp = "";
		for(int i=0; i<4; i++){
			tmp += nums[i];
		}
		S = Integer.valueOf(tmp);
	}
	
	private void setMax() {
		String tmp = "";
		for(int i=3; i>=0; i--){
			tmp += nums[i];
		}
		L = Integer.valueOf(tmp);
	}
	
	private void splitNumber() {
		for(int i=0; i<4; i++) {
			nums[i] = N.charAt(i)+"";
		}
		Arrays.sort(nums);
	}
	
	public int getCount() {
		if(N.equals("6174")) {
			return 0;
		} else if(!checkNumber()) {
			return -1;
		}
		changeNumber();
		return count;
	}
	
	private boolean checkNumber() {
		splitNumber();
		if(nums[0].equals(nums[1])){
			if(nums[0].equals(nums[2])){
				if(nums[0].equals(nums[3])){
					return false;
				}
			}
		}
		
		return true;
	}
	
	private void changeNumber() {
		int num,len;
		for(;;){
			count++;
			splitNumber();
			setMax();
			setMin();
			num = L - S;
			N = Integer.toString(num);
			if(N.equals("6174")) {
				break;
			}
			switch(N.length()) {
			case 1:
				N = "000" + N;
				break;
			case 2:
				N = "00" + N;
				break;
			case 3:
				N = "0" + N;
				break;
			}
		}
	}
}