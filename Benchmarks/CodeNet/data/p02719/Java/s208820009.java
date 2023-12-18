import java.util.Scanner;
import java.math.BigDecimal;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        BigDecimal x=BigDecimal.valueOf(stdIn.nextInt());
        BigDecimal y=BigDecimal.valueOf(stdIn.nextInt());
        BigDecimal z=BigDecimal.valueOf(0);
        while(x.compareTo(z)==1||x.compareTo(z)==0){
            x.subtract(y);
        }
        if(x.subtract(y)==z){
            System.out.println(0);
            
        }
        else{
        System.out.println(x);
        }
        
    }

}