import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
			String[] line = s.nextLine().split(" ");
			int cnt = Integer.parseInt(line[0]);
			int sum = Integer.parseInt(line[1]);
			if(cnt==0 && sum==0) {
				return;
			}
			int[] value = new int[cnt+1];
			for(int i=0 ; i<cnt ; i++) {
				value[i] = Integer.parseInt(s.nextLine());
			}
			value[cnt] = 0;
			System.out.println(solve(value, sum));
		}
	}

	public static int solve(int[] value, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		//????????¨??????
		for(int i=0 ; i<value.length ; i++) {
			for(int j=0 ; j<value.length ; j++) {
				if(! list.contains(value[i] + value[j])) {
					list.add(value[i] + value[j]);
				}
			}
		}

		Object[] objList = list.toArray();
		Arrays.sort(objList);

		int returnValue = 0;
		//???????????????
		for(int i=0 ; i<value.length ; i++) {
			for(int j=0 ; j<value.length ; j++) {
				if(sum < (value[i] + value[j]))
					continue;
				int remainSum = sum - (value[i] + value[j]);
				int start = 0;
				int end = objList.length -1;
				int mid=0;
				while(start<=end) {
					mid = (start+end) / 2;
					if((Integer)objList[mid]>remainSum) {
						end = mid-1;
					}else if((Integer)objList[mid]<remainSum) {
						start = mid+1;
					}else {
						break;
					}
				}
				if(remainSum<(Integer)objList[mid])
					returnValue = Math.max(returnValue, ((Integer)objList[mid-1] + value[i] + value[j]));
				else
					returnValue = Math.max(returnValue, ((Integer)objList[mid] + value[i] + value[j]));
			}
		}
		return returnValue;
	}
}