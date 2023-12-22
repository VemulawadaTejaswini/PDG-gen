import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int inta = Integer.parseInt(str[0]);
        int intb = Integer.parseInt(str[1]);
 
        System.out.printf("%d %d %f", inta/intb, inta%intb, (double)inta/intb);
 
    }
 
}