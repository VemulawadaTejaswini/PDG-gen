import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputNumber     = sc.nextInt();
        int inputNumber2    = sc.nextInt();
        int inputNumber3    = sc.nextInt();
        
        int count = 0;
        for(int i = inputNumber; i <= inputNumber2; i++){
            if((inputNumber3 % i) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

