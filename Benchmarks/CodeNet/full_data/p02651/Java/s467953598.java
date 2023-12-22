import java.util.*;

public class Main {
    Set<Long> set;
    Set<Long> set2;
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            long[] A = new long[N];
            for(int i = 0; i < N; i++) {
                A[i] = scanner.nextLong();
            }
            String S = scanner.next();
            
            ans.add(doSomething(N, A, S.toCharArray()));
        }
        for(Integer a : ans) {
            System.out.println(a);
        }
    }

    private int doSomething(int n, long[] a, char[] s) {
        int x = 0;
        List<Long> arr1 = new ArrayList<>();
        List<Long> arr0 = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            if(s[i] == '0') {
                arr0.add(a[i]);
            }else{
                arr1.add(a[i]);
            }
        }

        set = new HashSet<>();
        set2 = new HashSet<>();
        makeSet(arr1, 0, 0);
        delSet(arr0, 0, 0);

        for(Long l : set2) {
            set.remove(l);
        }

        if(set.size() > 0) {
            return 1;
        }else{
            return 0;
        }
    }

    private void delSet(List<Long> arr0, long val, int i) {
        if(arr0.size() <= i) return;
        long xor = val ^ arr0.get(i);
        if(set2.contains(xor)) return;
        set2.add(xor);
        set2.add(val);
        delSet(arr0, val, i+1);
        delSet(arr0, xor, i+1);
    }

    private void makeSet(List<Long> arr1, long val, int i) {
        if(arr1.size() <= i) return;
        long xor = val ^ arr1.get(i);
        if(set.contains(xor)) return;
        set.add(xor);
        set.add(val);
        makeSet(arr1, val, i+1);
        makeSet(arr1, xor, i+1);
    }
}