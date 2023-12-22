import java.util.*;
class Main{
    static Scanner sr = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        long a = sr.nextLong();
        long b = sr.nextLong();
        long c = sr.nextLong();
        long d = sr.nextLong();
        if(a<0&&c<0&&a*c>b*d)
            System.out.println(a*c);
        else if(a<0&&c>0)
            System.out.println(b*c);
        else if(c<0&&a>0)
            System.out.println(a*d);
        else
            System.out.println(b*d);


        }
    }


