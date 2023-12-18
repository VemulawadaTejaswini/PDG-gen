import java.util.*;

// Status -------------------------------
// 
// --------------------------------------

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = Integer.parseInt(scan.next());
        int Y = Integer.parseInt(scan.next());
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());

        int sum = 0;

        Integer[] p = new Integer[A];
        Integer[] q = new Integer[B];
        Integer[] r = new Integer[C];
        
        for(int i=0; i<A; i++) p[i] = Integer.parseInt(scan.next());
        for(int i=0; i<B; i++) q[i] = Integer.parseInt(scan.next());
        for(int i=0; i<C; i++) r[i] = Integer.parseInt(scan.next());

        Arrays.sort(p, Collections.reverseOrder());
        Arrays.sort(q, Collections.reverseOrder());
        Arrays.sort(r, Collections.reverseOrder());

        int a_idx = 0;
        int b_idx = 0;
        int c_idx = 0;

        for(int i=0; i<X; i++)
        {
            if(c_idx<C && r[c_idx]>=p[a_idx])
            {
                sum += r[c_idx];
                c_idx += 1;
            }else{
                sum += p[a_idx];
                a_idx += 1;
            }
        }

        for(int i=0; i<Y; i++)
        {
            if(c_idx<C && r[c_idx]>=q[b_idx])
            {
                sum += r[c_idx];
                c_idx += 1;
            }else{
                sum += q[b_idx];
                b_idx += 1;
            }
        }

        System.out.println(sum);
    }
}