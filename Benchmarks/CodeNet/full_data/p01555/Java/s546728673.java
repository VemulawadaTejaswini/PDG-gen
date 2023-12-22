import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// FizzBuzz
// 2012/09/19
public class Main{
	Scanner sc=new Scanner(System.in);

	long n;

	void run(){
		n=sc.nextLong();
		solve();
	}

	void solve(){
		long left=0, right=(long)1e17;
		for(; left<right-1;){
			long mid=(left+right)/2;
			if(length(mid)<n){
				left=mid;
			}else{
				right=mid;
			}
		}

		int margin=(int)(n-length(right-1)-1);
		String ans="";
		for(int i=0; i<20; i++){
			ans+=fizzBuzz(right+i);
		}
		println(ans.substring(margin, margin+20));
	}

	long length(long n){
		long length=0;
		long b=1;
		for(int i=1; i<=18; i++){
			// (left, right]
			long left=b-1, right=min(b*10-1, n);
			if(left>=right){
				break;
			}
			long nFizz=right/3-left/3;
			long nBuzz=right/5-left/5;
			long nFizzBuzz=right/15-left/15;
			long nString=nFizz+nBuzz-nFizzBuzz;
			length+=(right-left-nString)*i+nFizz*4+nBuzz*4;
			b*=10;
		}
		return length;
	}

	String fizzBuzz(long n){
		if(n%15==0){
			return "FizzBuzz";
		}else if(n%3==0){
			return "Fizz";
		}else if(n%5==0){
			return "Buzz";
		}else{
			return ""+n;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}