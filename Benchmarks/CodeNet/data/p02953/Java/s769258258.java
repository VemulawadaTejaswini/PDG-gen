import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner sc=new Scanner(System.in);
			
			//横N個のマス目
			int N=sc.nextInt();
			long[] masuArray=new long[N];
			long count=0;
			
			for(int i=0;i<N;i++) {
				masuArray[i]=sc.nextLong();
			}
			
			for(int i=1;i<N;i++) {
				if(masuArray[i-1]>masuArray[i]) {
					masuArray[i-1]=masuArray[i-1]-1;
				}
			}
			
			for(int i=1;i<N;i++) {
				if(masuArray[i-1]>masuArray[i]) {
					count++;
				}
			}
			
			if(count!=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
	}

}
