import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner;
        int age = sc.nextInt();
        int priceB = sc.nextInt();
        
        if (priceB / 2 == 0){
            if(age <= 13 ){
                System.out.println(priceB);
            }else if(age >= 6 || age <=12){
                System.out.println(priceB / 2);
            }else if(){
                System.out.println("無料です");
            }
        } else{
            System.out.println("値段は偶数を入力してください");
        }
    }
}
