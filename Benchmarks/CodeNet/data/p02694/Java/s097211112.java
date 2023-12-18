import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int money = 100;
        int year = 0;
        sc.close();
        
        while(true){
            if(money >= x){
                System.out.println(year);
                break;
            }
            money+=(money/100);
            year++;
        }


        
            
        
    }
}