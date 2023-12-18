import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);
		int n = sc.nextInt();
		List<Long> list =new ArrayList<Long>();
		for(int i=0;n>i;i++) {
			long a = sc.nextLong();
			list.add(a);
		}
		long count=0;
		for(int i=0;n>i;i++) {
			for(int j=i+1;n>j;j++) {
				long a = list.get(i)^list.get(j);
				count=count+a;
			}
		}
		int answer = (int) (count%(Math.pow(10,9)+7));
		System.out.println(answer);
	}
}
