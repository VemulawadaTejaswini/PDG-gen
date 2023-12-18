import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        char [] a = n.toCharArray();
        if (n.length() < 4){
            System.out.println("No");
        }else  if (a[0]=='Y' && a[1]=='A' && a[2]=='K' && a[3]=='I'){
        System.out.println("Yes");}
        else {
            System.out.println("No");
        }
    }
}













