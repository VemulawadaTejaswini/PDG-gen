import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int old = sc.nextInt();
        int fee = sc.nextInt();

        if(old >= 13){
            System.out.println(fee);
        }else if(old <= 5){
            System.out.println(0);
        }else{
            System.out.println(fee/2);
        }
    }
}