

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] lines = line.split(" ");
        int A = Integer.parseInt(lines[0]);
        int B = Integer.parseInt(lines[1]);

        if(A < 9 && B < 9){
            System.out.println("Yay!");
        }else{
            System.out.println(":(");
        }
    }
}
