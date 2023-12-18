
import static java.util.Arrays.sort;
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
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int num = sc.nextInt();
    static int k = 0;
    static int ary[] = new int[n];
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0;i < ary.length;i++) ary[i] = sc.nextInt();
        while(num > 0){
            sort(ary);
            div();
        }
        long ans=0;
        for(int i = 0; i<ary.length;i++)ans += ary[i];
        System.out.print(ans);
    }
    static void div(){
        ary[n-1] /=2;
        num--;
        if(n!=1&&ary[n-1] > ary[n-2]) div();
    }
}
