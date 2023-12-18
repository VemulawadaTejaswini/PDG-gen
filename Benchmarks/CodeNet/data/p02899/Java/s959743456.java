import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < n; i++)
            l.add(s.nextInt());
        for (int i = 1; i < n+1; i++) {
    System.out.print(l.indexOf(i)+1+"\t");
        }
    }

}