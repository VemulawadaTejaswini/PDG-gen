import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            String s = input.next();

            if(a > 3200){
                System.out.println(s+"\n"+"a = "+a+ " is not less than 3200, so we print s = "+s+".");
            }
            else{
                System.out.println("red \n"+ "a = "+a +" is less than 3200, so we print red.");
            }

        }
    }
}