
import static java.lang.Math.sqrt;
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
        int m = kaijo(n);
        int[][] point = new int[n][2];
        double div[][] = new double[n][n];
        for(int i = 0;i < n;i++){
            point[i][0] = sc.nextInt();
            point[i][1] = sc.nextInt();
        }
        double ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0; j < n;j++){
                ans +=divs(point[i][0],point[j][0],point[i][1],point[j][1]);
            }
        }
        
        System.out.print((ans/m)*m/n);
    }
    
    static int kaijo(int n){
        if(n == 1)return 1;
        int k = n * kaijo(n-1);
        return k;
    }
    
    static double divs(int i1 ,int i2,int j1,int j2){
        return sqrt((i1-i2)*(i1-i2)+(j1-j2)*(j1-j2));
    }
    
}
