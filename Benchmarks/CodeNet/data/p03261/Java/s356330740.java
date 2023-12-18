import java.util.ArrayList;
import java.util.Arrays;
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
		List<String> list=new ArrayList<String>();
		for(int i=0;n>i;i++) {
			String s = sc.next();
			list.add(s);
		}
		List<String> listB = new ArrayList<String>(new HashSet<>(list));
		if(listB.size()!=list.size()) {
			System.out.println("No");
			System.exit(0);
		}
		for(int i=0;list.size()-1>i;i++) {
			String s = list.get(i);
			String t = list.get(i+1);
			List<String> list_s= new ArrayList<String>(Arrays.asList(s.split("")));
			List<String> list_t= new ArrayList<String>(Arrays.asList(t.split("")));
			s = list_s.get(list_s.size()-1);
			t = list_t.get(0);
			if(!s.equals(t)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}