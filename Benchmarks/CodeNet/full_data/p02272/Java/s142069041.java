import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		Scanner s = new Scanner(System.in);
		int arrayCnt = Integer.parseInt(br.readLine());
		int[] array = new int[arrayCnt];
		String[] tmpArray = br.readLine().split(" ");
		for(int i=0 ; i<array.length ; i++) {
			array[i] = new Integer(tmpArray[i]).intValue();
		}

		int cc = sort(array, 0, array.length-1);
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<array.length ; i++) {
			sb.append(array[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
		System.out.println(cc);
	}

	public static int sort(int[] array, int start, int end) {
		int c = 0;
		if(start < end){
			int mid = (start+end)/2;
			c += sort(array, start, mid);
			c += sort(array, mid+1, end);
			c += merge(array, start, end);
		}
		return c;
	}

	public static int merge(int[] array, int start, int end) {
		int cnt = 0;
		int mid = (start+end) / 2;
		int[] left = new int[mid-start+2];
		int[] right = new int[end-mid+1];
		for(int i=0 ; i<left.length-1 ; i++) {
			left[i] = array[start+i];
		}
		for(int j=0 ; j<right.length-1 ; j++) {
			right[j] = array[mid+j+1];
		}
		int l = 0;
		int n = 0;
		left[mid-start+1] = Integer.MAX_VALUE;
		right[end-mid] = Integer.MAX_VALUE;
		for(int k=0 ; k<left.length+right.length-2 ; k++) {
			if(left[l] > right[n]) {
				array[start] = right[n];
				n++;
			}else{
				array[start] = left[l];
				l++;
			}
			cnt++;
			start++;
		}
		return cnt;
	}
}