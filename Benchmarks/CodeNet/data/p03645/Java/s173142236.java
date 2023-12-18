import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ena000078
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> brList1 = new ArrayList<>();
        ArrayList<Integer> brList2 = new ArrayList<>();
        
        for(int i=0;i<M;i++){
            int f = sc.nextInt();
            int t = sc.nextInt();
            if(f == 1){
                brList1.add(t);
            }else if(t == N){
                brList2.add(f);
            }
        }
        Collections.sort(brList1);
        Collections.sort(brList2);
        
        String pos = "IMPOSSIBLE";
        for(int tBr1 : brList1){
            boolean bPos = brList2.contains(tBr1);
            if(bPos){
                pos = "POSSIBLE";
                break;
            }
        }
        System.out.println(pos);
    }
    
}
