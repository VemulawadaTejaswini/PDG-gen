import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S= sc.next();
        String[] SArray = new String[S.length()];
        double K=sc.nextDouble();
        long num=0;
        long tyo=5*100000000*10000000;
        for (int i = 0; i < S.length(); i++) {
            SArray[i] = String.valueOf(S.charAt(i));
            int a=Integer.parseInt(SArray[i]);
            if(a!=1)num +=Math.pow(a,tyo);
            else num++;
            System.out.println(num);
            if(num>K){
                System.out.println(SArray[i]);
                return;
            }
        }
        
    }
}
