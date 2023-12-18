import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int lon=0;
	
	List<Integer>list=new ArrayList<Integer>();
	int count=0;
	for(int i=a;i<=b;i++) {
		if(i<a+c||i>b-c) {
			list.add(i);
			count++;
		}
	}
	for(int i=0;i<count;i++) {
		System.out.println(list.get(i));
	}
	scan.close();
}
}