import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int priceB = sc.nextInt();

            if(age >= 13 ){
                System.out.println(age);
                System.out.println(priceB);
            }else if(age >= 6 || age <=12){
                System.out.println(age);
                System.out.println(priceB / 2);
            }else{
                System.out.println("0");
            }
    }
}
