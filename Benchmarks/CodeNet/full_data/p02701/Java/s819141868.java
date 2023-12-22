import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		int a = sc.nextInt();
		int flag;
		for(int i = 0; i < a; i++) {
			flag = 0;
			String b = sc.next();
			for(int j = 0; j < al.size(); j++) {
				if((al.get(j).equals(b))) flag = 1;
			}
			if(flag == 0) al.add(b);
		}
		System.out.println(al.size());
	}
}