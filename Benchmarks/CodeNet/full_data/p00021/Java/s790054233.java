import java.util.Scanner;
 
public class Main{
    private static Scanner scan;
    public static void main(String[] args) {
        double a[] = new double[8];
        scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        for(int i = 0;i < n;i++){
            for(int j = 0;j < 8;j++)a[j] = Double.parseDouble(scan.next());
            double ab = (a[3] - a[1]) /(a[2] - a[0]);
            double cd = (a[7] - a[5]) /(a[6] - a[4]);
            if(ab == cd){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        System.exit(0);
    }
 
}