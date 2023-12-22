import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x,tmp = 1;
        while((x = scan.nextInt()) != 0){
            System.out.println("Case " + tmp + ": " + x);
            tmp++;
        }




    }

}
