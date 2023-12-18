import java.util.ArrayList;
import java.util.Collections;
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
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		Collections.sort(list, Collections.reverseOrder());
		List<Integer> list_kou=new ArrayList<Integer>();
		for(int i=0;n-1>i;i++) {
			int a = list.get(i);
			int b = list.get(i+1);
			while(true) {
				int c = a%b;
				if(c==0) {
					list_kou.add(b);
					break;
				}
				a=b;
				b=c;
			}
		}
		int answer=Collections.min(list_kou);
		System.out.println(answer);
	}
}