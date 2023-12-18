import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> al = new ArrayList();
        int tmp;
        for(int i=0;i<N;i++){
            tmp = sc.nextInt();
            int ans = al.indexOf(tmp);
            if (ans == -1){
                al.add(tmp);
            }else{
                al.remove(ans);
            }
        }
        System.out.println(al.size());
    }
    
}