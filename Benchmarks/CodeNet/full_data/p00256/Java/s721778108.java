import java.util.*;

public class Main {
	//1654 start
	Scanner sc = new Scanner(System.in);
	int [] changeM = {20 * 20 * 18 * 20, 20 * 18 * 20, 18 * 20, 20, 1};
	int [] day = {-1,31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	private void doit(){
		long day20121221 = getdays(2012, 12, 21);
		long daymax = getdays(10000000,12,31);
		
		while(true){
			String s = sc.next();
			if(s.equals("#")) break;
			String [] data = s.split("\\.");
			if(data.length == 3){
				int [] num = new int[3];
				for(int i = 0; i < 3; i++){
					num[i] = Integer.parseInt(data[i]);
				}
				long nowdays = getdays(num[0], num[1], num[2]);
				long diff = nowdays - day20121221;
				diff = diff % (changeM[0] * 13);
				String res = getM(diff);
				System.out.println(res);
			}
			else{
				int [] num = new int[5];
				for(int i = 0; i < 5; i++){
					num[i] = Integer.parseInt(data[i]);
				}
				long res = getdaysfromM(num);
				String ans = getyear(res);
				System.out.println(ans);
			}
		}
	}
	
	private String getyear(long res) {
		if(res <= 10){
			long d = 21 + res;
			return "201212" + d;
		}
		res = res - 11;
		int y = 2013,m = 1, d = 1;
		while(true){
			int add = isleapYear(y) ? 1 : 0;
			if(res / (add + 365) == 0){
				break;
			}
			else{
				y++;
				res -= add + 365;
			}
		}
		for(int i = 1; i <= 12;i++){
			if(res < day[i] + (isleapYear(y) && i == 2 ? 1 : 0)){
				d += res;
				break;
			}
			else{
				res -= day[i] + (isleapYear(y) && i == 2 ? 1 : 0);
				m++;
			}
		}
		return y + "." + m + "." + d ;
	}
	
	private boolean isleapYear(int i) {
		if(i % 4 != 0){
			return false;
		}
		else if(i % 400 == 0){
			return true;
		}
		else if(i % 100 == 0){
			return false;
		}
		else{
			return true;
		}
	}

	private long getdaysfromM(int[] num) {
		long sum = 0;
		for(int i = 0; i < 5; i++){
			sum += (long)num[i] * changeM[i];
		}
		return sum;
	}

	private String getM(long diff) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5; i++){
			sb.append("." + (diff / changeM[i]));
			diff = diff % changeM[i];
		}
		return sb.substring(1);
	}

	long getdays(int y, int m, int d) {
		if (m <= 2) {
			y--;
			m += 12;
		}
		long dy = (long)365 * (y - 1);
		long c = y / 100;
		long dl = (y >> 2) - c + (c >> 2);
		long dm = (m * 979 - 1033) >> 5;
		return dy + dl + dm + d - 1;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}