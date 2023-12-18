import java.util.Scanner;
 
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String S = sc.next();
        int minDiff = -1;
        int X = 0;
        int minX= 0;
        //System.out.println("S="+S);
        for(int i = 0 ; i < S.length() - 3; ++i) {
            
            String sub = S.substring(i, i+3);
            
            X = Integer.parseInt(sub);
            int diff = Math.abs(X - 753);
            if(minDiff ==-1 || diff < minDiff) {
                minX = X;
            }
            //System.out.println("X="+X+" sub="+sub+" minX="+minX +" diff="+diff);
          System.out.println(diff);
        }
 
    }
 
}