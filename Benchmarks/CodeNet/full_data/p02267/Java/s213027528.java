import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> S = new ArrayList<Integer>();
    ArrayList<Integer> T = new ArrayList<Integer>();
    LinearSearch LS = new LinearSearch();
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
	    if(T.get(j) == S.get(i))
		count++;
    System.out.println(count);
    }
}
