
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
        String s = sc.next();
        char[] str = s.toCharArray();
        sort(str);
        char a = 'a';
        for(int i = 0;i < str.length;i++){
            if(str[i] == a)a++;
            if(a == 'z'){
                System.out.print("None");
                return;
            }
        }
        System.out.print(a);
    }
    
}
