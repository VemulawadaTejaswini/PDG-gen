package blackjack;

import java.util.Scanner;

public class Black_Jack {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A1 = 0, A2 = 0, A3 = 0,result=0;
        A1 = input.nextInt();
        A2 = input.nextInt();
        A3 = input.nextInt();
        
        if (1 <= A1 && A1 <= 13 && 1 <= A2 && A2 <= 13 && 1 <= A3 && A3 <= 13 ) {
            
           result=A1+A2+A3;
            System.out.println(result);
            if(result==22 || result>22){
                System.out.println("bust");
            }
            else{
                System.out.println("win");
            }
            

        }
        else{
            System.out.println("Wrong input.");
        }

    }
}
