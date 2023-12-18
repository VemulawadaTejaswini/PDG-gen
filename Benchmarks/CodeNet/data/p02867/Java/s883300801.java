import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_a=new ArrayList<Integer>();
		List<Integer> list_b=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_a.add(a);
		}
		for(int i=0;n>i;i++) {
			int b = sc.nextInt();
			list_b.add(b);
		}

		for(int i=0;n>i;i++) {
			if(list_a.get(i)>list_b.get(i)) {
				for(int j=0;n>j;j++) {
					if(list_a.get(j)<=list_b.get(i)) {
						if(list_a.get(i)<=list_b.get(j)) {
							int a = list_a.get(i);
							list_a.set(i, list_a.get(j));
							list_a.set(j, a);
							break;
						}
					}
					if(j==n-1) {
						System.out.println("No");
						System.exit(0);
					}
				}
			}
		}
		System.out.println("Yes");
	}
}