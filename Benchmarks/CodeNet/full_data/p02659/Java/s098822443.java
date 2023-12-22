import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        String B = sc.next();
        char[] bc = B.toCharArray();
        long b = (bc[0]-'0');
        if(bc.length <= 2){
            System.out.println(A*b);
        }else if(bc.length == 3){
            long b1 = (bc[2]-'0');
            if(b == 0 && b1 == 0){
                System.out.println("0");
                return;
            }
            String str = String.valueOf(A*(b*10+b1));
            System.out.println(str.substring(0, str.length()-1));
        }else{
            long b1 = (bc[2]-'0');
            long b2 = (bc[3]-'0');
            if(b == 0 && b1 == 0 && b2 == 0){
                System.out.println("0");
                return;
            }

            String str = String.valueOf(A*(b*100+b1*10+b2));
            System.out.println(str.substring(0, str.length()-2));
        }
    }
}
