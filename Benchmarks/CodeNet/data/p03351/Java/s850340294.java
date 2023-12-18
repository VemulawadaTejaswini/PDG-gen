import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        String ans;
        if (Math.abs(a-c) <= d){
            ans = "Yes";
        }else if((Math.abs(a-b) <= d) && (Math.abs(b-c) <= d)){
            ans = "Yes";
        }else{
            ans = "No";
        }
        
        System.out.println(ans);
    }
    
}
