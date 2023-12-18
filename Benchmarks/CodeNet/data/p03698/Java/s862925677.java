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
        String S  = sc.next();
        
        for(int i=0;i<S.length()-1;i++){
            int diff = S.indexOf(S.substring(i, i+1), i+1);
            if (diff!=-1){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
    
}
