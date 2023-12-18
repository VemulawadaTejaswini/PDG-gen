import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Work[] arr = new Work[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Work(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        TreeSet<Integer> set = new  TreeSet<>();
        for (int i = 0; i < m; i++) {
            set.add(i);
        }
        set.add(Integer.MIN_VALUE); //dummy
        long total = 0;
        for (Work w : arr) {
            int d = m - w.day;
            d = set.floor(d);
            if (d ==Integer.MIN_VALUE) {
                continue;
            }
            total += w.income;
            set.remove(d);
        }
        System.out.println(total);
    }
    
    static class Work implements Comparable<Work>{
        int day;
        int income;
        
        public Work(int day, int income) {
            this.day = day;
            this.income = income;
        }
        
        public int compareTo(Work w) {
            if (income == w.income) {
                return w.day - day;
            } else {
                return w.income - income;
            }
        }
    }
}
