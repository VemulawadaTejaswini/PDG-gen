import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            int t = scan.nextInt();
            if (list.contains(t)){
                System.out.println("NO");
                return;
            }else
                list.add(t);
        }
        System.out.println("YES");
    }
}
