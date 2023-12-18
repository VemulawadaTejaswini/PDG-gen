import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		String s = sc.next();
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		list.add("k");
		list.add("l");
		list.add("m");
		list.add("n");
		list.add("o");
		list.add("p");
		list.add("q");
		list.add("r");
		list.add("s");
		list.add("t");
		list.add("u");
		list.add("v");
		list.add("w");
		list.add("x");
		list.add("y");
		list.add("z");
		for(int i=0;list.size()>i;i++) {
			if(list.get(i).equals(s))
				System.out.println(list.get(i+1));
		}

	}
}