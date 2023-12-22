
import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    static final int BITS = 10;
    //Does not manage input == 1024;
    public static void main(String[] args) throws IndexOutOfBoundsException {
        
        //read from standard input
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int number = in.nextInt();
            ArrayList<Integer> numbersList = new ArrayList<>();
            
            for (int i = 0; i < BITS; i++) {
                
                //if the reminder of ((number/2) / 2) is 1
                if ((number >> i) % 2 == 1) {
                    //...then add pow(i,2) to the numbersList
                    numbersList.add(1 << i);
                }
            }
            System.out.print(numbersList.get(0));
            for (int i = 1; i < numbersList.size(); i++) {
               
                System.out.print(" " + numbersList.get(i));
                
            }
            System.out.println();
        }

    }
}