import java.util.Scanner;
import java.util.TreeSet;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		TreeSet<String> set;
		while((st = sc.nextLine()) != null){
			int hit = 0, blow = 0;
			set = new TreeSet<String>();
			String[] a = st.split(" ");
			String[] b = sc.nextLine().split(" ");
			for(int i = 0; i < 4; i++)
				set.add(a[i]);
			for(int i = 0; i < 4; i++)
				if(a[i].equals(b[i])){
					hit++;
					set.remove(a[i]);
				}
			for(int i = 0; i < 4; i++)
				if(set.contains(b[i]))
					blow++;
			System.out.println(hit+" "+blow);
		}
	}
}