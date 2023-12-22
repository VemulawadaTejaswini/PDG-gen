import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner s = new Scanner(System.in);
		while(true){
			int cnt = s.nextInt();
			int sum = s.nextInt();
			if(cnt==0 && sum==0) {
				return;
			}
			int[] value = new int[cnt+1];
			for(int i=0 ; i<cnt ; i++) {
				value[i] = s.nextInt();
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
					if(value[i] + value[j] <= sum)
						list.add(value[i] + value[j]);
				}
			}
		}
		Collections.sort(list);

		int returnValue = 0;
		//???????????????
//		for(int i=0 ; i<value.length ; i++) {
//			for(int j=0 ; j<value.length ; j++) {
		int index = list.size()-1;
		for(int i=0 ; i<list.size() ; i++) {
			while(list.get(i) + list.get(index) > sum)
				index--;
			returnValue = Math.max(list.get(i) + list.get(index), returnValue);
//				if(sum < (Integer)objList[i])
//					continue;
//				int remainSum = sum - ((Integer)objList[i]);
//				int start = 0;
//				int end = objList.length -1;
//				int mid=0;
//				while(start<=end) {
//					mid = (start+end) / 2;
//					if((Integer)objList[mid]>remainSum) {
//						end = mid-1;
//					}else if((Integer)objList[mid]<remainSum) {
//						start = mid+1;
//					}else {
//						break;
//					}
//				}
//				if(remainSum<(Integer)objList[mid])
//					returnValue = Math.max(returnValue, ((Integer)objList[mid-1] + (Integer)objList[i]));
//				else
//					returnValue = Math.max(returnValue, ((Integer)objList[mid] + (Integer)objList[i]));
		}
		return returnValue;
	}
}