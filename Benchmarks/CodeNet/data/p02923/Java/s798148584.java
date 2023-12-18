import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list_medi=new ArrayList<Integer>();
		int n= sc.nextInt();
		for(int i=0;n>i;i++) {
			int a= sc.nextInt();
			list.add(a);
			list_medi.add(a);
		}

		Collections.sort(list_medi);
		double x =0;

		if(n%2==1) {
			x = list_medi.get(n/2);
		}
		else {
			x = (list_medi.get(n/2-1)+list_medi.get(n/2))/2;
		}

		List<Integer> list_answer=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			if(list.get(i)<=x) {
				continue;
			}
			int count=0;
			for(int j=i;n-1>j;j++) {
				if(list.get(j)>=list.get(j+1)) {
					count++;
				}
				else {
					i=i+count;
					break;
				}
			}
			list_answer.add(count);
		}

		System.out.println(Collections.max(list_answer));
	}

}