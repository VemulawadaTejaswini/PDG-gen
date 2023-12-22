import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> S = new ArrayList<>();
        List<Integer> T = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) S.add(sc.nextInt());
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) T.add(sc.nextInt());
        T.retainAll(S);
        System.out.println(T.size());

    }

}