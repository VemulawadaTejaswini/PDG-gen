import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class A implements Comparable<A>{
	public A(){}
	public A(int i,int v){
		index =i;
		value = v;
	}
	int index;
	int value;
	
	public int compareTo (A a){
		return value > a.value ? 1 : -1;
	}
}
public class Main {
	public static void main(String args[]){//double 处理果盘
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		A[] a = new A[n];
		for (int i=0;i<n;i++){
			a[i] = new A(i+1,in.nextInt());
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			System.out.print(a[i].index+" ");
		}
	}
}	
		
	