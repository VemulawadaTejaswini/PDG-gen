import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		int su = 1;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int answer=0;
		for(int i=0;n>i;i++) {
			if(list.get(i)==su)
				su++;
			else
				answer++;
		}
		if(answer==n)
			System.out.println(-1);
		else
			System.out.println(answer);
	}
}