
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main{

public static void solve(){
      FastReader sc= new FastReader();
   	  int n=sc.nextInt();
   	  int d=sc.nextInt();
       System.out.println((n+d)%24);
   	  
    }
static int flip(int k,int n){
	String s=Integer.toBinaryString(n);
	int i=s.length()-1;
	while(i>=0 && k>0){
		if(s.charAt(i)=='1') k--;
		i--;
	}
	n&=~(1<<(i+1));
	return n;
}
public static void main(String[] args) throws IOException  {
          new Thread(null ,new Runnable(){
            public void run(){
                try{
                    solve();
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        },"1",1<<26).start();
	 
}

static int a[]=new int[100001];
static void seive(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;i*j<=n;j++){
				a[i*j]++;
			}
		}
	}
static long gcd(long a,long b){
	if(b==0) return a;
	return gcd(b,a%b);
}
static void seive(ArrayList<Long> l1){
	boolean power []=new boolean[1000001];
	for(int i=2;i*i<=1000000;i++){
		 if(!power[i]){
			 for(int j=2*i;j<=1000000;j+=i) power[j]=true;
		 }
	}
	for(int i=2;i<=1000000;i++) l1.add((long) i);
}
static boolean isPrime(long n){
	for(int i=2;i<=Math.sqrt(n);i++){
		if(n%i==0) return false; 
	}
	return true;
}
static int min=Integer.MAX_VALUE;
 
static long ncr(long n,long r){ 
	if(r==0 || r==n) return 1;
	double d=1;
	if(r>n) r=n-r;
	for(int i=0;i<r;i++){
		d*=(double)(n-i)/(i+1);
		
	}
	return (long)d;
}
 
static long d, x, y;
static void extendedEuclid(long A, long B) {
    if(B == 0) {
        d = A;
        x = 1;
        y = 0;
    }
    else {
        extendedEuclid(B, A%B);
        long temp = x;
        x = y;
        y = temp - (A/B)*y;
    }
}
static long modInverse(long A, long M)
{
    extendedEuclid(A,M);
    return (x%M+M)%M;    
}
static long modPow(long x,long y,long M){
	if(y==0) return 1;
	if(y%2==0) return modPow((x*x)%M,y/2,M);
	else return (x*modPow((x*x)%M,(y-1)/2,M))%M;
}
static long M=(long)Math.pow(10,9)+7;
 
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(){
        		br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
       
        int nextInt(){   return Integer.parseInt(next()); }
        long nextLong(){  return Long.parseLong(next()); }
        double nextDouble() {  return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
 