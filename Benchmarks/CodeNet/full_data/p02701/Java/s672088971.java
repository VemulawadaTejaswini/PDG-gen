

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static class Solution {

        public void find() {

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            set.add(sc.nextLine());
        }
        System.out.println(set.size());
        sol.find();
    }
}

