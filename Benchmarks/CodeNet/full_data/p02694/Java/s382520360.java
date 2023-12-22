import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
 
    int cou = 0;
    long money = 100;
    while(money < x) {
    	money *= 1.01;
    	cou++;
    }
        	System.out.println(cou);
      }
}
