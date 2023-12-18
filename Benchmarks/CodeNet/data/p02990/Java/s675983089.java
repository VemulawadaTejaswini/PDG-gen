import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	long n = Long.parseLong(sc.next());
	long k = Long.parseLong(sc.next());
	long a = 0;
	long b = 0;
	
	for(int i = 1;i < k+1; i++){
		if(i < n - k +1){
			a = calcCom(k-1,i-1);
			b = calcCom(n-k+1,i);
			System.out.println((a*b)%1000000007l);
		}else{
			System.out.println("0");
		}	
	}
}
public static long calcCom(long n, long r){
	long num = 1;
	for(int i = 1; i <= r; i++){
		num = num * (n - i + 1) / i;
	}
	return num;
}
}
