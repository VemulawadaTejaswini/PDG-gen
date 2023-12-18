import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> S = new HashSet<String>();      
        for (int i=0; i<N; i++) {
        	S.add(sc.next());
        }        
		System.out.println(S.size());
	}
}