import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        List<Integer> l = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            l.add(a[i]);
        }

        List<Tuple> operations = new ArrayList<>();
        boolean isGoingToBeNegative = (n%2==1);
        while(l.size() > 1) {
            int min = l.get(0);
            int max = l.get(l.size()-1);
            l.remove(l.size()-1);
            l.remove(0);
            Tuple t = new Tuple();
            if(isGoingToBeNegative) {
                t.x = min;
                t.y = max;
            }
            else {
                t.x = max;
                t.y = min;
            }
            operations.add(t);
            int x_y = t.x-t.y;
            if(l.size()==0 || x_y >= l.get(l.size()-1)) {
                l.add(x_y);
            }
            else {
                for(int i=0; i<l.size(); i++) {
                    if(x_y <= l.get(i)) {
                        l.add(i, x_y);
                        break;
                    }
                }
            }
            isGoingToBeNegative ^= true;
        }
        System.out.println(l.get(0));
        for(int i=0; i<operations.size(); i++) {
            Tuple t = operations.get(i);
            System.out.print(t.x);
            System.out.print(" ");
            System.out.println(t.y);
        }
    }
}
class Tuple {
    int x;
    int y;
}