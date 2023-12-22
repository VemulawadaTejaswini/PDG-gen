import java.util.*;
public class Main{
    static Scanner sc = new Scanner(System.in);
    static double x1, y1, x2, y2, x3, y3, xp, yp;
    static double S_pab, S_pac, S_pbc, S_abc;
    public static void main(String[] args){
        while(read()){
            slove();
        }
    }
    static boolean read(){
        if(!sc.hasNext())
            return false;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        xp = sc.nextDouble();
        yp = sc.nextDouble();

        return true;
    }

    static void slove(){
        S_pab = Math.abs((x1-xp)*(y2-yp)-(x2-xp)*(y1-yp));
        S_pac = Math.abs((x1-xp)*(y3-yp)-(x3-xp)*(y1-yp));
        S_pbc = Math.abs((x2-xp)*(y3-yp)-(x3-xp)*(y2-yp));
        S_abc = Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1));

        if(S_abc == S_pab + S_pac + S_pbc){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}