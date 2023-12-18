import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s1 = cin.nextLine();
        String s2 = cin.nextLine();
        int x = s2.indexOf(s1);
        if(x==0 && s1.length()+1==s2.length())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}