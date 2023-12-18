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
        String str = sc.next();
        if(n%2!=0){
            System.out.print("No");
            return;
        }
        char[] strf = new char[n/2];
        char[] stre = new char[n/2];
        int i = 0;
        while(i < n/2-1){
            if(str.charAt(i)!=str.charAt(i+n/2)){
                System.out.print("No");
                return;
            }
            i++;
        }
        System.out.print("Yes");
    }
    
}
