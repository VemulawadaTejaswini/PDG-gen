

import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		long sum;//??´??°?????°
		int n;
		n = scan.nextInt();
		sum = 0;//????¨??????¨????????????
		
		List<Long> list = new ArrayList<Long>();
		
		//n?????????????????????????????\??????
		for(int count = 0; count < n ; count++){
			list.add(Integer.toUnsignedLong(scan.nextInt()));
			
		}
		
		
		//??????????????????????????????????????¨??????????????????????????????n-1
		Collections.sort(list);
		
		//??¨????????????????¨?????????¨???
		for(int i =0;i < list.size();i++){
			sum = sum + list.get(i);
		}
		
		System.out.println(String.valueOf(list.get(0)) + " " + String.valueOf(list.get(n-1)) + " " + String.valueOf(sum));
		
		
	}
}