import java.util.*;


public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
           
            int n = sc.nextInt();
            int c = 0;
            while (n != 0) {
                if (n % 10 == 2) {
                    c++;
                }
                n = n/10;
            }
            System.out.println(c);
            sc.close();
        }
    
}

