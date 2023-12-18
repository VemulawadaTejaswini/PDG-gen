import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int[] bekis = {
				2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576,2097152,4194304,8388608,16777216,33554432,67108864,134217728,268435456,536870912,1073741824
		};
		int count=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(n);
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
//		arr.sort(null);
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++) {
			int num=arr.get(i);
			arr.remove(i);
			for(int beki:bekis) {
				int bin=Collections.binarySearch(arr, beki-num);
				if(bin>-1) {
					arr.remove( bin );
					count++;
				}
			}
		}

		System.out.println(count);

	}
//	boolean isBeki(int num) {
//		return Integer.bitCount(num)==1 ? true : false ;
//	}

}
