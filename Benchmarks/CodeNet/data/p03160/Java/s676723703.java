import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = scn.nextInt();
		}
		int ans = solution(0,arr);
        System.out.println(ans);
	}
	
	public static int solution(int idx,int[] arr){
	    if(idx==arr.length-1)return 0;
	    int ans = 0;
	    int o1 = idx+1<arr.length?solution(idx+1,arr)+Math.abs(arr[idx+1]-arr[idx]):1000000;
	    int o2 = idx+2<arr.length?solution(idx+2,arr)+Math.abs(arr[idx+2]-arr[idx]):1000000;
	    return Math.min(o1,o2);
	}
}
