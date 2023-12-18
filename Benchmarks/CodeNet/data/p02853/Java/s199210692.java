import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int prize = 0;
        
        switch(X){
            case 1: prize += 100000;
            case 2: prize += 100000;
            case 3: prize += 100000;
        }
        switch(Y){
            case 1: prize += 100000;
            case 2: prize += 100000;
            case 3: prize += 100000;
        }
        if(prize == 600000){
            prize += 400000;
        }
        
        System.out.println(prize);
    }
}
