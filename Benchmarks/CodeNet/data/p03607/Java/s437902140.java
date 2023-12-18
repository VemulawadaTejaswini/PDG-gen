import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int arr[] = new int[10000005];
		int t ;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(n-- !=0) {
			t = sc.nextInt();
//			if(t>arr.length) t%=1000003;
//			if(arr[t]==0) arr[t]=1;
//			else arr[t]=0;
			boolean has=false;
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i)==t) {
					list.remove(i);
					has = true;
				}
			}
			if(!has) {
				list.add(t);
				Collections.sort(list);
			}
		}
//		Arrays.sort(arr);
//		int ans=0;
//		for (int i = arr.length-1; i >=0; i--) {
//			if(arr[i]==1) ans++;
//			else break;
//		}
		
		System.out.println(list.size());
	}	
}
