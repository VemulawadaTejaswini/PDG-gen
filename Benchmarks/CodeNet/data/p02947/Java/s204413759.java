import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Mian {
	public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();

				HashMap<String,Integer>m=new HashMap<>();

				for(int i=0;i<n;++i) {
					char[] c=s.next().toCharArray();
					Arrays.sort(c);
					m.merge(String.valueOf(c),1,Integer::sum);
				}
				System.out.println(m.values().stream().mapToInt(i->(i-1)*i/2).sum());
    }
}