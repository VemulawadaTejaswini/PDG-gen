import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        Set<String> hash_set = new HashSet<String>();
        
        for(int i=0;i<A;i++) {
        	String s = sc.next();
        	hash_set.add(s);
        }
        System.out.println(hash_set.size());
        

	}
}
