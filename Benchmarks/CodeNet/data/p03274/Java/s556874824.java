import java.util.Scanner;

public class Main{
	
	static int[] point;
	static int stepNum;
	static int num;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		stepNum = sc.nextInt();
		boolean flag = true;
		int start  = -1;
		point = new int[num];
		
		int arrStart = -1;
		int arrEnd = -1;
		
		for(int i = 0 ; i < point.length; i++){
			int temp = sc.nextInt();
			if(temp >= 0 && flag){
				start = i;
				flag = false;
			}
			point[i] = temp;
		}
		
		if(start == -1){
			arrStart = num-stepNum;
			arrEnd = num-1;
			System.out.println(Math.abs(point[arrStart]));
			return;
		}
		
		if(start == 0) {
			System.out.println(Math.abs(point[stepNum-1]));
			return;
		}
		
		if(start >= stepNum+1 ){
			arrStart = start - stepNum;
			arrEnd = start - 1;
		}
		
		if(start <= stepNum){
			arrStart = 0;
			arrEnd = stepNum - 1;
		} 
		
		int ss = getShortArr(arrStart, arrEnd, Integer.MAX_VALUE);
		System.out.println(ss);
		
	}
	
	public static int getShortArr(int arrStart, int arrEnd, int dis) {
		if(arrEnd >= num) {
			return dis;
		}
		int[] arr = getArr(arrStart, arrEnd);
		
		int disPre = getDis(arr);
		if( arr[0] > 0){
			return dis=dis>disPre?disPre:dis;
		}
		if(dis <= disPre){
			disPre = dis;
		}
		
		return getShortArr(++arrStart, ++arrEnd,disPre);
	}
	
	public static int getDis(int[] arr) {
		
		int start =  0;
		
		if(arr[start] <= 0 && arr[arr.length-1]==0) {
			return  Math.abs(arr[0]-arr[arr.length-1]);
		}else if(arr[start] <= 0 && arr[arr.length-1]>0){
			if( Math.abs(arr[start]) >  Math.abs(arr[arr.length-1])) {
				return  Math.abs(arr[0]-arr[arr.length-1])+Math.abs(arr[arr.length-1]);
			} else {
				return  Math.abs(arr[0]-arr[arr.length-1])+Math.abs(arr[0]);
			}
			
		}else if(arr[start]>0){
			return  arr[arr.length-1];
		}else if(arr[arr.length-1] < 0){
			return  Math.abs(arr[0]);
		}
		
		return -1;
	}
	
	public static int findIndex(int[] arr, int val){
		int flag = 1;
		for(int i = 0; i < arr.length; i++) {
			if(val == 0 && arr[i] == 0 && flag == 2){
				return i;
			}
			if(val == arr[i]) {
				return i;
			}
			
		}
		return -1;
	}
	
	public static int[] getArr(int start, int end){
		int[] arr = new int[end - start+1];
		
		for(int i = start; i <= end; i++) {
			arr[i-start] = point[i];
		}
		
		return arr;
	}
	
}
