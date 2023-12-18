import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int counter = 0;
        for(int i=0;i<3;i++){
            int n = s.nextInt();
            if(n==1)
                counter++;
        }
        System.out.println(counter);
    }
}
