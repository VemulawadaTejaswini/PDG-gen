import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                sc.close();
                boolean ebishu = true;
                while(n >= 0){
                        if(n % 7 == 0){
                                ebishu = false;
                        }
                        n -= 4;
                }
                if(!ebishu) System.out.println("Yes");
                else System.out.println("No");
        }
}