import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    HashSet<Integer> S = new HashSet<Integer>();
    HashSet<Integer> T = new HashSet<Integer>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++)
	S.add(sc.nextInt());
    int q = sc.nextInt();
    for(int i = 0; i < q; i++)
	T.add(sc.nextInt());
    int count = 0;
    for(Integer T1 : T)
	if(S.contains(T1)) count++;
    System.out.println(count);
    }
}
