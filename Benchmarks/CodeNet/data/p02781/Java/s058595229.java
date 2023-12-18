import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.next();
        int k = stdIn.nextInt();
        
        long num = 0;
        char c[] = n.toCharArray();
        if(k == 1){
            
            
            if(n.length() == 1){
                System.out.println(n);
            }else{
                System.out.println(9 * n.length() - 9 + c[0] - 48);
            }
            
        }else if(k == 2){
            long aaa = n.length() - 1;
            aaa = aaa * (aaa - 1) / 2; //nC2
            aaa *= 81;
            
            long bbb = 0;
            //まだ
            
            System.out.println(aaa + bbb);
        }else{
            long aaa = n.length();
            aaa = aaa * (aaa - 1) * (aaa - 2) / (3 * 2); //nC3
            aaa *= 9 * 9 * 9;
            
            long bbb = 0;
            //まだ
            
            System.out.println(aaa + bbb);
        }
        
        
    }
}
