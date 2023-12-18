
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner("2 3 1 2");
        int w = Integer.parseInt(sc.next());
        int h = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        float area = w * h;

        int flagBit;

        if(x*2==w && y*2==h){
            flagBit = 1;
        }else{
            flagBit = 0;
        }

        System.out.print(area / 2.0);
        System.out.print(" ");
        System.out.println(flagBit);
    }
}