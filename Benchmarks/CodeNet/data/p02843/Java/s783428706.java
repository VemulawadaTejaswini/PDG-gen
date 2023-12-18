import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int[] prices = new int[]{100,101,102,103,104,105};

        if(recursive(amount, prices)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

    static boolean recursive(int amount, int[] prices){
        if(amount < 100){
            return false;
        }
        if(calcAmount(amount, prices)){
            return true;
        }
        for(int p : prices){
            if(recursive(amount - p, prices)){
                return true;
            }
        }
        return false;
    }

    static boolean calcAmount(int amount, int[] prices){
        for (int p : prices){
            if((amount % p) == 0){
                return true;
            }
        }
        return false;
    }
}