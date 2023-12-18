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
        int lg = s.length() -1;
        int ans = 0;
        char[] str = s.toCharArray();
        for(int i = 0;i <= lg/2;i++){
            if(str[i]!=str[lg-i])ans++;
        }
        System.out.print(ans);
    }
    
}
