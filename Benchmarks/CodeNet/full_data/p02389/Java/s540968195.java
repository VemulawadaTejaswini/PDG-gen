import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        String input2 = input1.nextLine();
        String[] fac = input2.split("\\s+");
        int a = Integer.parseInt(fac[0]);
        int b = Integer.parseInt(fac[1]);
        int ab = a * b;
        int syu = 2 * (a + b);
        Sytstem.out.println(ab+"\s"+syu);

        }
    }

