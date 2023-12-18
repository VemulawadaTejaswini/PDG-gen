import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String s = scan.next();
        if(s.charAt(a)!='-')
        {
            System.out.println("No");
            return;
        }
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)=='-')
            {
                System.out.println("No");
                return;
            }
        }
        for(int j=a+1;j<a+b+1;j++)
        {
            if(s.charAt(j)=='-')
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }    
}