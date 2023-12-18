import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<Integer> acList = new HashSet<>();
        int waCnt = 0;
        for (int i = 0; i < m; i++){
            int q = sc.nextInt();
            String r = sc.next();
            if(!acList.contains(q)) {
                if (r.equals("AC")) {
                    acList.add(q);
                } else {
                    waCnt++;
                }
            }
            sc.nextLine();
        }
        System.out.println(acList.size() + " " + waCnt);
    }
}
