import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        ArrayList<Boolean> list = new ArrayList<>();
        long total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                list.add(true);
            } else if (arr[i] == 'B' && i < arr.length - 1 && arr[i + 1] == 'C') {
                list.add(false);
                i++;
            } else {
                total += getCount(list);
                list.clear();
            }
        }
        total += getCount(list);
        System.out.println(total);
    }
    
    static long getCount(ArrayList<Boolean> list) {
        int count = 0;
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i)) {
                sum += i - count;
                count++;
            }
        }
        return sum;
    }
}
