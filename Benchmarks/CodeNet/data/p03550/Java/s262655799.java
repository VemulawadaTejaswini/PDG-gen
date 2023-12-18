import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();

		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
		}

		int x=z;
		int y=w;

		int i=0;
		while(true){
			int max=0;
			int max_num=0;
			for(int j=i;j<n;j++){
				if(max>a[j]) continue;
				max=a[j];
				max_num=j;
			}
			x=max;
			i=max_num;

			int min=2140000000;
			int min_num=0;
			if(i+1==n) break;
			for(int j=i+1;j<n;j++){
				if(min<=a[j]) continue;
				min=a[j];
				min_num=j;
			}
			y=min;
			i=min_num;
			if(i+1==n) break;
		}
		System.out.println(Math.abs(x-y));
	}
}
