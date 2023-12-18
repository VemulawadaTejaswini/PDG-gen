

import java.util.*;

public class Main {
    static class Solution {
        int n =0;
        int k=0;
        int c = 0;
        Set<Integer> set = new HashSet();
        Boolean[][] dp;
        public void find(String str, int n, int k, int c) {
            this.n = n;
            this.k = k;
            this.c = c;
            dp = new Boolean[n][k];
            List<Integer> list = new ArrayList();
            int i=1;
            for(char ch : str.toCharArray()) {
                if(ch == 'o') {
                    list.add(i);
                }
                i++;
            }

            if(!generate(list, new HashSet(), 0, -1)) {
                System.out.println();
                return;
            }

            List<Integer> list1 = new ArrayList<Integer>(set);
            Collections.sort(list1);
            for(Integer val : list1) {
                System.out.println(val);
            }
            
        }

        boolean generate(List<Integer> list, HashSet hashSet, int index, int prev) {
            
            if(dp[index][hashSet.size()] != null) {
                return dp[index][hashSet.size()];
            }
            if(hashSet.size() == k) {
                if(set.size() == 0) {
                    set = new HashSet(hashSet);
                }
                Iterator it = hashSet.iterator();
                boolean found = false;
                Set<Integer> common = new HashSet();
                while(it.hasNext()) {
                    int val = (int)it.next();
                    if(set.contains(val)) {
                        found = true;
                        common.add(val);
                    }
                }
                set = new HashSet(common);
                if(found == false) {
                    return false;
                }
                return true;
            }
            if(index == list.size()) {
                return true;
            }

            for(int i=index; i<list.size(); i++) {
                int val = list.get(i);
                if(prev != -1) {
                    if(prev + c >= val) {
                        continue;
                    }
                }
                hashSet.add(val);
                if(!generate(list, hashSet, i+1, val)) {
                    return false;
                }
                hashSet.remove(val);
            }
            dp[index][hashSet.size()] = true;
            return true;
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        sol.find(str, n, k, c);
    }
}
