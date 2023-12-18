import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[n];
		int n = sc.nextInt();
		int[] array = new int[n];
		int m = sc.nextInt();
		for(int i=0;n>i;i++) {
			array[i]=1;
		}
		for(int i=0;n>i;i++) {
			int h = sc.nextInt();
			list.add(h);
		}
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a=a-1;
			b=b-1;
			if(list.get(a)==list.get(b)) {
				array[a]=0;
				array[b]=0;
			}
			else if(list.get(a)<list.get(b)) {
				array[a]=0;
			}
			else {
				array[b]=0;
			}
		}
		int answer=0;
		for(int i=0;n>i;i++) {
			answer=answer+array[i];
		}
		System.out.println(answer);
	}
}