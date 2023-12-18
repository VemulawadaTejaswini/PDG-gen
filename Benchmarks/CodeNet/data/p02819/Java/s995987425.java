import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        boolean che = true;
        boolean soi;
        while(che == true){
            soi = true;
            for(int i = 2 ; i < (int)Math.sqrt(n) && soi == true ; i++){
                if(n % i == 0){
                    soi = false;
                }
            }
            if(soi == true){
                System.out.println(n);
                che = false;
            }
            n++;
        }
        sc.close();
    }
}