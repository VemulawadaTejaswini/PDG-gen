
import java.util.Scanner;


/**
 *
 * @author Mohamed Abd El-Meged
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String S;
        
      
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        if (S.toUpperCase().equals("SUN")){
            System.out.println("It is Sunday today, and seven days later, it will be Sunday again");
        }
        else if (S.equals("MON")){
                        System.out.println("It is Monday today, and six days later, it will be Sunday again");

        }
        else if (S.equals("TUE")){
                        System.out.println("It is Tuesday today, and five days later, it will be Sunday again");

        }
        else if (S.equals("WED")){
                        System.out.println("It is Wednesday today, and four days later, it will be Sunday again");

        }
        else if (S.equals("THU")){
                        System.out.println("It is Thursday today, and three days later, it will be Sunday again");

        }
else if (S.equals("FRI")){
                        System.out.println("It is Friday today, and two days later, it will be Sunday again");

        }        
        else if (S.equals("SAT")){
                        System.out.println("It is Saturday today, and one days later, it will be Sunday again");

        }
    }
    
}
