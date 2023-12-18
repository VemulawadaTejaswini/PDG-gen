import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedInsertion {
    static List<Integer> a = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        List<Integer> b = new ArrayList<Integer>();
        // a.add(0, 1);
        for(int i=0; i<N; i++) {
            b.add(scn.nextInt());
        }
        for(int i=1; i<N+1; i++) {
            // if(a.get(a.size() - 1) < b.get(b.size() - 1)) {
            //     a_insert(b.get(b.size() - 1));

            // }
            boolean is_clear = a_insert(b.get(0));
            if(!is_clear) {
                System.out.println("-1");
                break;
            }
        }
        for(int i=0; i<a.size(); i++) {
            System.out.println(a.get(i));
        }
        
    }
    public static boolean a_insert(Integer element){
        try {
            a.add(element-1, element); //(index, element)
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}