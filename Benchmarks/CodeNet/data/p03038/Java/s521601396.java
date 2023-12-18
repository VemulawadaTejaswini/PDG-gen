import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];

        long sum = 0;
        Map<Integer, Integer> bc = new TreeMap<Integer, Integer>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int b= scanner.nextInt();
            int c=scanner.nextInt();
            bc.put(c, b);
        }


        int k = 0;
        for (int i : bc.keySet()) {
            if(a[k] >= i){
                break;
            }
            for (int j = 0; j < bc.get(i); j++) {
                if (a[k] < i) {
              
                    a[k++] = i;
                } else {
                    break;
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }

}

class Comp implements Comparator {

    int index = 0;

    void set_index(int i) {
        index = i;
    }

    @Override
    public int compare(Object a, Object b) {
        int[] int_a = (int[]) a;
        int[] int_b = (int[]) b;
        return (int_a[index] - int_b[index]);
    }


}

