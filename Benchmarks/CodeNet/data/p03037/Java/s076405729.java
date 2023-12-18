import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer=0;
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=a;b+1>j;j++) {
				list.add(j);
			}
			if(i==0)
				continue;
			for(int j=0;list.size()>j;j++) {
				int c = list.get(j);
				int count=0;
				for(int k=0;list.size()>k;k++) {
					if(c==list.get(k))
						count++;
				}
				//System.out.println(list);
				//System.out.println(c);
				if(count<=i) {
					list.remove(list.indexOf(c));
					j=-1;
				}
			}
		}
		List<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
		System.out.println(listB.size());
	}
}