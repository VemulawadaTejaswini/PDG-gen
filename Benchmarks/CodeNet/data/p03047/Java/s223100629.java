package ProgrammingChallenge.diverta2019programmingcontest;

import java.util.Scanner;

/**
 * 1,2,...,Nの整数からK個選ぶ方法は何通り？
 *
 * @author uumee
 *
 */
public class ConsecutiveIntegers {

    /** main */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(sc.nextInt() - (sc.nextInt() - 1));
	sc.close();
    }

}
