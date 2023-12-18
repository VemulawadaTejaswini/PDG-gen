import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
	private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	int T=sc.nextInt();
    	int ans=0;
    	for(int i=A;i<=T+0.5;i+=A) {
    	
    		ans+=B;
    	}
    	
    	p(ans);
    	
    	
    	
    	
    	//j 106 || //o 111 || //i 105 || //a 97 || 
    	//10 15 9
    	//long T=(long) (Math.pow(26, 2)*10+26*15+9);
    }
    static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;
		
		
		
		int minPos=-1;
		char min =Character.MAX_VALUE;
		
		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}
		
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
}