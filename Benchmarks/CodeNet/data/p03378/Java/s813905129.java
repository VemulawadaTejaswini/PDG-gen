

import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int  n =Integer.parseInt(s[0]);
		int  m =Integer.parseInt(s[1]);
		int  x =Integer.parseInt(s[2]);
		int arr[] = new int[m];
		String s1[] = br.readLine().split(" ");
		for (int i = 0; i < s1.length; i++) {
			arr[i]=Integer.parseInt(s1[i]);
		}
		int res=0;
		int left = 0;
		int right = m-1;
		while(left<right) {
			int mid = (left+right)/2;
			//System.out.println("mid"+mid);
			if(arr[mid] < x) {
				res = mid;
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		if(res == 0 && arr[0]>x) {
			System.out.println(0);
		}
		
		else {
			//System.out.println("res = "+res);
			System.out.println(Math.min(res+1, m-res-1));
		}
	}

}
