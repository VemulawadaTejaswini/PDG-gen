import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

class Main{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                String[] s = new String[3];
                for(int i=0;i<3;i++){
                        s[i] = sc.next();
                }
                System.out.println(s[0].charAt(0)+s[1].charAt(1)+s[2].charAt(2));
        }
}
