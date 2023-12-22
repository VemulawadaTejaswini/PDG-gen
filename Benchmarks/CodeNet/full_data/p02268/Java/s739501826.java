package ALDS1_4_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =  Integer.parseInt(br.readLine());
		String[] sStr = br.readLine().split(" ");
		int S[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			S[i] = Integer.parseInt(sStr[i]);
		}

		int q = Integer.parseInt(br.readLine());
		String[] tStr = br.readLine().split(" ");
		int T[] = new int[q];
		for(int i = 0 ; i < q ; i++){
			T[i] = Integer.parseInt(tStr[i]);
		}

		System.out.println(binarySearch(S,T));
	}

	public static int binarySearch(int[] S,int[] T){
		int min = 0;
		int max = T.length;
		int mid;
		int count = 0;
		int searchNum;

		for(int y = 0; y < T.length; y++){
			searchNum = T[y];
			min = 0;
			max = S.length;
			mid = (max + min) / 2;
			while(max > min){
				if(S[mid] == searchNum){
					count++;
					break;
				}else if(S[mid] < searchNum){
					min = mid + 1;
				}else{
					max = mid;
				}
				mid = (max + min) / 2;
			}
		}

		return count;
	}

}