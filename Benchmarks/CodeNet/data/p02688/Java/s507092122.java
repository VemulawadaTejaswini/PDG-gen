import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] nStr = s.split(" ",0);
        int n = Integer.getInteger(nStr[0]);
        Set<String> aSet = new HashSet<>();
        while (sc.hasNext()) {
            int d = sc.nextInt();
            String aStr = sc.nextLine();
            String[] a = aStr.split(" ",0);
            for (int i=0;i<a.length;i++) {
                aSet.add(a[i]);
            }
        }
        int aInt = aSet.size();
        System.out.println(n-aInt);

    }
}
