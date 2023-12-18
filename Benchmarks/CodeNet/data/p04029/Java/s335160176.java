import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double fig = Integer.parseInt(sc.next());
        double ame = (1 + fig) / 2 * fig;
        System.out.println((int)fig);
    }
}