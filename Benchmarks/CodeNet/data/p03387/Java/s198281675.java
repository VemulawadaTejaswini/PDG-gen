import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);

		//整数ABC
		int[] suu=new int[3];
		suu[0]=sc.nextInt();
		suu[1]=sc.nextInt();
		suu[2]=sc.nextInt();
		Arrays.sort(suu);
		int count=0;

		while(suu[0]!=suu[1]||suu[0]!=suu[2]||suu[1]!=suu[2]) {
			Arrays.parallelSort(suu);
			if(suu[2]-suu[0]>=2&&suu[2]-suu[1]<2) {
				suu[0]+=2;
				count++;
			}else {
				suu[0]+=1;
				suu[1]+=1;
				count++;
			}
		}
		
		System.out.println(count);

	}

}