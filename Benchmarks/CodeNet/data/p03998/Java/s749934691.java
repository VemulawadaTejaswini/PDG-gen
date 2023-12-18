import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        scanner sc = new Scanner(System.in);
        string a,b,c;
        a = sc.next();
        b = sc.next();
        c = sc.next();
        string[] acard = a.split("",0);
        string[] bcard = b.split("",0);
        string[] ccard = c.split("",0);
        string temp = acard[0];
        int al = acard.length;
        int bl = bcard.length;
        int cl = ccard.lenght;
        boolean alo = false;
        boolean blo = false;
        boolean clo = false;
        int acount = 1;
        int bcount = 0;
        int ccount = 0;
        int breakcount = 0;
        while(true)
        {
            switch(temp)
            {
                case "a":
                    if(alo==false)
                    {
                        if(al != acount)
                        {
                            temp = acard[acount];
                            acount = acount + 1;
                        }
                        else
                        {
                            alo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                case "b":
                    if(blo == false)
                    {
                        if(bl != bcount)
                        {
                            temp = bcard[bcount];
                            bcount = bcount + 1;
                        }
                        else
                        {
                            blo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                case "c":
                    if(clo == false)
                    {
                        if(cl != ccount)
                        {
                            temp = ccard[ccount];
                            ccount = ccount + 1;
                        }
                        else
                        {
                            clo = true;
                            breakcount = breakcount + 1;
                        }
                    }
                break;
                default:
                break;
            }
            if(breakcount <= 2)
            {
                break;
            }
        }
        if(alo == false)
        {
            System.out.println("A");
        }
        if(blo == false)
        {
            System.out.println("B");
        }
        if(clo == false)
        {
            System.out.println("C");
        }
    }
}