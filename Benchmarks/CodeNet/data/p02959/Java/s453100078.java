import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_mon=new ArrayList<Integer>();
		List<Integer> list_yu=new ArrayList<Integer>();
		int n = sc.nextInt();
		for(int i=0;n+1>i;i++) {
			int a=sc.nextInt();
			list_mon.add(a);
		}
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_yu.add(a);
		}
		int count=0;
		for(int i=0;n>i;i++) {
			if(list_yu.get(i)>list_mon.get(i)) {
				if(list_yu.get(i)-list_mon.get(i)-list_mon.get(i+1)<0) {
					count=count+list_mon.get(i)+list_mon.get(i+1)-(list_yu.get(i)-list_mon.get(i));
					list_mon.set(i+1, list_mon.get(i+1)-(list_yu.get(i)-list_mon.get(i)));
				}
				else {
					count=count+list_mon.get(i)+list_mon.get(i+1);
					list_mon.set(i+1, 0);
				}
			}
			else {
				count=count+list_yu.get(i);
			}
		}

		System.out.println(count);
	}

}