import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        List<Integer> b = new LinkedList<>();
        for(int i = 0;i < a.length;i++)
            a[i] = sc.nextInt();
        for(int i = 0;i < a.length;i++) {
            b.add(a[i]);
            Collections.reverse(b);
        }
        lsp(b);

    }
    private static void lsp(List ls)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < ls.size() - 1;i++)
            sb.append(ls.get(i) + " ");
        sb.append(ls.get(ls.size() - 1));
        System.out.println(sb.toString());
    }
}