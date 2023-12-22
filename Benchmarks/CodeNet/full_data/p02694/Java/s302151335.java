import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long money = 100;
        int year = 0;
        sc.close();
        
        while(true){
            if(money >= x){
                System.out.println(year);
                break;
            }
            money*=1.01;
            year++;
        }
    }
}