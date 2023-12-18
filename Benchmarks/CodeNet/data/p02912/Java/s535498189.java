
import static java.util.Arrays.sort;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {
    //abc141 d

    /**
     * @param args the command line arguments
     */

    //static int k = 0;
    //static int ary[] = new int[n];
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> q = new PriorityQueue();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        
        for(int i = 0;i < n;i++) q.add(-1*sc.nextInt());
        //System.out.println("dainyuu");
        int j = 0;
        while(num>j){
            int k = (int) q.poll();
            k /= 2;
            q.add(k);
            j++;
        }
        
        long ans = 0;
        for(int i = 0;i<num&&q.peek()!=null;i++) {
            ans -= (int)q.poll();
        }
        System.out.print(ans);
    }
    /*static void div(){
        ary[n-1] /=2;
        num--;
        if(n!=1&&ary[n-1] > ary[n-2]) div();
    }*/
}
