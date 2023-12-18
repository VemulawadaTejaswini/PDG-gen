import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
            map.putIfAbsent(a[i],0);
            map.put(a[i], map.get(a[i])+1);
        }

        Arrays.sort(a);

        for(int k = n-1; k>=0; k--) {
            
            if (map.get(a[k]) >= 4) {
                System.out.println(a[k] * a[k]);
                return;
            } else if (map.get(a[k]) >= 2) {
                int next = 0;
                for (int i = k; i >= 0; i--) {
                    if (a[i] != a[k]) {
                        next = a[i];
                        break;
                    }
                }
                System.out.println(a[k]*next);
                return;
            }
        }
        System.out.println(0);



    }
}
