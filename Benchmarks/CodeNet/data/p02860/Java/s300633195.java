import java.util.Scanner;

public class Main
{
public static void main(String[] args) throws Exception 
{
Scanner sc1 = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);

int N = sc1.nextInt();
String S = sc2.nextLine();

    if((N & 1) == 0)
    {
        String s1 = S.substring(0, N/2);
        String s2 = S.substring(N/2);
        if(s1.equals(s2))
        {
            System.out.println("Yes");
        }
        System.out.println("No");
    }
    sc1.close();
sc2.close();

}    
}