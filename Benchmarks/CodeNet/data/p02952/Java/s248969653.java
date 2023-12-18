import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner();

        int twoFilter = 100;
        int threeFilter = 1000;
        int fourFilter = 10000;
        int fiveFilter = 100000;
        if (sc < twoFilter) {
            System.out.println(sc);
        } else if (sc < threeFilter) {
            System.out.println(sc-100);
        } else if (sc < fourFilter) {
            System.out.println(sc-100);            
        } else if(sc < fiveFilter) {
            System.out.println(sc-10100);
        } else {
            System.out.println(90909);         
        }

    }
}