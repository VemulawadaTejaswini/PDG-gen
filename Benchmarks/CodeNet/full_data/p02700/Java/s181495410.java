import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int ah=ob.nextInt();int as=ob.nextInt();
        int bh=ob.nextInt();int bs=ob.nextInt();
        int tak=(int)Math.ceil((double)bh/as);
        int akoi=(int)Math.ceil((double)ah/bs);
        System.out.println(tak<=akoi?"Yes":"No");
    }
}