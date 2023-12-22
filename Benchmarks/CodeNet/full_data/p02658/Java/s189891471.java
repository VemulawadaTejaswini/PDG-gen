import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        BigDecimal biga = new BigDecimal(s);
        BigDecimal one = new BigDecimal(s);
        String[] array = new String[n];
        for(int i=0;i<n;i++){
            array[i] = sc.next();
            if(array[i].equals("0")){
                System.out.println(0);
                sc.close();
                return;
            }
        }
        for(int i=0;i<n;i++){
            BigDecimal bigb = new BigDecimal(array[i]);
            biga = biga.multiply(bigb);
            if(biga.subtract(one).toString().length()>18){
                System.out.println(-1);
                sc.close();
                return;
            }
            biga.add(one);
        }
        String aa = biga.toString();
        long bb = Long.parseLong(aa);
        System.out.println(bb);
        sc.close();
    }
}