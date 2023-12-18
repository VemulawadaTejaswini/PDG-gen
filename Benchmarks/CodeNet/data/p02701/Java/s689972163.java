

import java.util.Scanner;
import java.util.HashSet;

 class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet mySet = new HashSet();
        for (int i = 0; i < n; i++) {
            mySet.add(sc.next());
        }
        System.out.println(mySet.size());
    }

}
