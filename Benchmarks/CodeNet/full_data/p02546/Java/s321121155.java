import java.util.*;
public class Main  {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String s=sc.nextLine();
        int length=s.length();
        char c=s.charAt(length-1);
        if(Character.isLowerCase(c))
        {
            if(c=='s')
            {
                System.out.println(s+"es");
            }
            else{
                System.out.println(s+"s");
            }
        }
        sc.close();
    }
}
