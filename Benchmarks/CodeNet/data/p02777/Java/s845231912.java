import java.util.Scanner;

class as
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String S = s.next();
        String T = s.next();
        int A = s.nextInt();
        int B = s.nextInt();
        String U = s.next();
        if(U.equalsIgnoreCase(S))
            A--;
        else
            B--;
        System.out.println(A+" "+B);
        }
    }