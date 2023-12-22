import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> S = new ArrayList<Integer>();
    ArrayList<Integer> T = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++)
	S.add(sc.nextInt());
    int q = sc.nextInt();
    for(int i = 0; i < q; i++)
	T.add(sc.nextInt());
    int count = 0;
    for(int i = 0; i < n; i++)
	for(int j = 0; j < q; j++)
	    if(S.get(i).equals(T.get(j)))
		count++;
    System.out.println(S.get(10));
    System.out.println(T.get(11));
    System.out.println(count);
    }
}
