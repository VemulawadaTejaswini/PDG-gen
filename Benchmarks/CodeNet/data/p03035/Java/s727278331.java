import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int priceB = sc.nextInt();

            if(age >= 13 ){
                System.out.println(priceB);
            }else if(age >= 6 && age <=12){
                System.out.println(priceB / 2);
            }else if(age <= 5){
                System.out.println("0");
            }
    }
}
