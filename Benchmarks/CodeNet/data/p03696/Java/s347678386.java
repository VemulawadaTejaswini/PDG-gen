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
        String S = sc.next();
        
        int count = 0;
        for(int i=0;i<N;i++){
            String tmp = S.substring(i, i+1);
            if("(".equals(tmp)){
                count++;
            }else if(")".equals(tmp)){
                count--;
            }
        }
        if (count < 0) {
            while(count != 0){
                S = "(" + S;
                count++;
            }
        }else if (count > 0) {
            while(count != 0){
                S = S + ")";
                count--;
            }
        }
        System.out.println(S);
    }
    
}
