import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        System.out.println((int)n*(n+1)/2);
    }
}
