import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int max=0;
		int [] array = new int[k];
		for(int i=0;n-k+1>i;i++) {
			int count=0;
			for(int j=0;k>j;j++) {
				count=count+list.get(i+j);
			}
			//System.out.println(count);
			if(count>max) {
				for(int j=0;k>j;j++) {
					max=count;
					array[j]=list.get(i+j);
				}
			}
		}
		double answer=0;
		for(int i=0;k>i;i++) {
			for(int j=1;array[i]+1>j;j++) {
				answer=answer+(double)j/(double)array[i];
				//System.out.println(answer);
			}
			//System.out.println(answer);
		}
		System.out.println(answer);
	}
}