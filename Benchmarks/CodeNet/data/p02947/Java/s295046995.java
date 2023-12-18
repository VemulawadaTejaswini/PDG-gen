
import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ary = new String[n];
        String[] ans = new String[n];
        long poyo = 0;
        for(int i = 0;i < n;i++){
            String tmp = sc.next();
            char[] hoge = new char[10];
            for(int j = 0;j < 10;j++){
                hoge[j] = tmp.charAt(j);
            }
            sort(hoge);
            StringBuilder bl = new StringBuilder();
            bl.append(hoge);
            tmp = bl.toString();
            ary[i] = tmp;            
        }
        for(int i = 0; i < n;i++){
            for(int j = 0;j < n;j++){
                if(i!=j&&ary[i].equals(ary[j]))poyo++;
            }
        }
        System.out.print(poyo/2);
    }
    
}
