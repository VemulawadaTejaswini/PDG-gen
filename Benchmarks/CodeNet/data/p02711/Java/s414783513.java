import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if(s.contains("7")) System.out.println("Yes");
        else System.out.println("No");
        scanner.close();
    }
}