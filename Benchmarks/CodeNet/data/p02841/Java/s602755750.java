
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("入力してください > ");
        //int    x = Integer.parseInt(scanner.nextLine());
        //int n = Integer.parseInt(scanner.nextLine());
        //String d = scanner.nextLine();
       
        //int n    =  Integer.parseInt(scanner.nextLine());
        String[] s1 =  scanner.nextLine().split(" ");
        int m1 = Integer.parseInt(s1[0]);
        int d1 = Integer.parseInt(s1[1]);
        
        String[] s2 =  scanner.nextLine().split(" ");
        int m2 = Integer.parseInt(s2[0]);
        int d2 = Integer.parseInt(s2[1]);
        
        
        if( m1 == m2){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
        
        
        
        
        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
    private static boolean kaeru(int a, int b,long x, int n){
        
        return kakaku(a, b, n) <= x;
    }
    private static int kakaku(int a, int b,int n){
        
        return a*n + b*keta(n);
    }
    private static int keta(int n){
        
        int keta = 1;
        double nn = n;
        while(nn >= 10){
            nn = nn/10.0;
            keta++;
        }
        return keta;
        
    }
}