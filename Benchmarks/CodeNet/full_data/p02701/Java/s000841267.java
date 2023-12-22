import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	List<String> strList1=new ArrayList<String>();
	for(int i=0;i<N;i++) {
		String S=sc.next();
		strList1.add(S);
	}
	List<String> listB = new ArrayList<String>(new HashSet<>(strList1));
	int len=listB.size();
	System.out.println(len);
	}
}
