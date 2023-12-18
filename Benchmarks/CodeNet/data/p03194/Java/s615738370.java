import java.util.*;


public class Main {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
           
            int a = sc.nextInt();
            long n = sc.nextInt();
            int[] yakusu = new int[2000000];
            long pro = 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n >= i && n % i == 0) {
                    yakusu[i]++;
                    n = n /i;
                }
            }
            for (int i = 0; i < yakusu.length; i++) {
                while (yakusu[i] >= a) {
                    pro = pro * i;
                    yakusu[i] = yakusu[i] -a;
                }
            }
            System.out.println(pro);


            sc.close();
        }
    
}

