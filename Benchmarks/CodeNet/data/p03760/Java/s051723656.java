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
        String O = sc.next();
        String E = sc.next();
        String password="";
        
        int df = O.length() - E.length();
        
        for(int i=0;i<E.length();i++){
            password += (O.substring(i, i+1) + E.substring(i, i+1));
        }
        
        if(df != 0){
            password += O.substring(O.length()-1, O.length());
        }
        System.out.println(password);
    }
    
}
