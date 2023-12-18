import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();



		//int[] a = new int[n];
		int[] b = new int[n-1];

		char before = s.charAt(0);
		for(int i =0 ; i<n-1;i++) {
			if(s.charAt(i+1)==before) {
				b[i]=0;
			}else {
				if(before=='L') {
					b[i]=-1;
				}else {
					b[i]=1;
				}
			}
			 before = s.charAt(i+1);
		}



		long sum = 0;
		int negative =0;
		int positive =0;

		for(int i =0;i<n-1;i++) {
			if(b[i]==-1)negative++;
			if(b[i]==1)positive++;
			if(b[i]==0)sum++;
		}

		int couple=Math.min(negative, positive);
		int isolate =0;
		if(negative!=positive)isolate =1;


		for(int i=0;i<k;i++) {
			if(couple>0) {
				sum=sum+2;
				couple--;
			}else {
				if(isolate>0) {
					sum++;
					isolate--;
				}
			}

		}



		System.out.println(sum);
	}
}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/