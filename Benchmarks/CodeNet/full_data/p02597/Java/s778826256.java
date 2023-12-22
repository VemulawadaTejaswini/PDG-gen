import java.util.*;
//import static java.lang.System.out;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=in.next();
		int[] cntw=new int[n];
		int[] cntr=new int[n];
		int totalw=0;
		int totalr=0;
//		System.out.println(s.charAt(0));
		cntw[0]=(s.charAt(0)=='W')? 1:0;
		cntr[0]=(s.charAt(0)=='R')? 1:0;
		for(int i=1;i<n;i++){
			if(s.charAt(i)=='W'){
				cntw[i]=cntw[i-1]+1;
				cntr[i]=cntr[i-1];
			}
			else {
				cntr[i]=cntr[i-1]+1;
				cntw[i]=cntw[i-1];
			}
		}
		totalw=cntw[n-1];
		totalr=cntr[n-1];
		System.out.println(Arrays.toString(cntw));
		System.out.println(Arrays.toString(cntr));
		if(totalr==0 || totalw==0) {
			System.out.println(0);
			return;
		}
		int ans=1000000000;
		for(int i=0;i<n;i++){
			int leftw,leftr,rightw,rightr;
			leftw=cntw[i];
			leftr=cntr[i];
			rightw=totalw-leftw;
			rightr=totalr-leftr;
			int swp=Math.min(leftw,rightr)+Math.max(leftw,rightr)-Math.min(leftw, rightw);
			ans=Math.min(swp,ans);
		}
		System.out.println(ans);
		
		
		
	}
}