import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int k = Integer.parseInt(sc.next());
	int a = 0;
	int b = 0;
	
	for(int i = 0;i < k; i++){
		if(i < n - k +1){
			a = calcCom(k-1,i-1);
			b = calcCom(n-k+1,i);
			System.out.println((a*b)/1000000007);
		}else{
			System.out.println("0");
		}	
	}
	
	
}
public static int calcCom(int n, int r){
	int num = 1;
	for(int i = 1; i <= r; i++){
		num = num * (n - i + 1) / i;
	}
	return num;
}
}
