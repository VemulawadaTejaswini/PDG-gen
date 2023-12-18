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
        int tmp = 0;
        int poyo;
        for(int i = 0;i < n;i++){
            poyo = sc.nextInt();
            if(poyo > tmp+1){
                System.out.print("No");
                return;
            }
            tmp = poyo;
        }
        System.out.print("Yes");
    }
    
}
