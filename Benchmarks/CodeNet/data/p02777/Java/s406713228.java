import java.util.Collections;
import java.util.Scanner;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String splt[] = scanner.nextLine().split(" ");
        String spltNum[] = scanner.nextLine().split(" ");
        String throwU = scanner.nextLine();
        if(throwU.equals(splt[0])){
            System.out.println(Integer.parseInt(spltNum[0])-1 + " " + spltNum[1]);
        }else{
            System.out.println(Integer.parseInt(spltNum[0]) + " " + (Integer.parseInt(spltNum[1]) - 1) );
        }

    }




}
