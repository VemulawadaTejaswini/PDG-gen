import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0;i<n;i++){
			num[i] = sc.nextInt();
		}
		Sort(num);

	}
	static void Sort(int[] num){
		int v,j;
		for(int i=0;i<num.length;i++){
			v = num[i];
			j = i-1;
			while(j>=0 && num[j]>v){
				num[j+1] = num[j];
				j--;
			}
			num[j+1] = v;
			Print(num);
		}

	}

	static void Print(int[] a){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			sb.append(a[i]);
			if(i<a.length-1)sb.append(" ");
		}
		System.out.println(sb);
	}
}