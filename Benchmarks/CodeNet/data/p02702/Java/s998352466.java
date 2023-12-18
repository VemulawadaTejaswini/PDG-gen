import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<String> list=new ArrayList<String>();
		//int[] array = new int[n];
		String s = sc.next();
		List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		int count=0;
		for(int i=0;list.size()>i;i++) {
			String check = list.get(i);
			for(int j=i+1;list.size()>j;j++) {
				check = check+list.get(j);
				long nimaru = Long.parseLong(check);
				if(nimaru%2019==0)
					count++;
			}
		}
		System.out.println(count);
	}
}