import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        s += sc.nextLine();
        String t = sc.next();
        t += sc.nextLine();
        boolean flag= true;
        String temp = "";
        int place1 = 0;
        int place2 = 0;
        outer:for(int i = 0; i < s.length();i++)
        {
            for(int j = 0; j < t.length();j++)
            {
                if(s.charAt(i) == t.charAt(j))
                {
                    for(int k = 0;k<j;k++)
                    {
                        if(s.charAt(i-j+k) == '?' || s.charAt(i-j+k) == t.charAt(k))
                        temp += t.charAt(k);
                        else
                        flag = false;
                    }
                    temp+=t.charAt(j);
                    place1 = i;
                    place2 = j;
                    for(int l=j+1;l<t.length();l++)
                    {
                        if(s.charAt(i+l-j) == '?' || s.charAt(i+l-j) == t.charAt(l))
                        temp += t.charAt(l);
                        else
                        flag= false;                        
                    }
                    if (flag)
                    break outer;
                }
                temp = "";
            }
        }
        System.out.println(place2);
        if(temp == "")
        System.out.print("UNRESTORABLE");
        else
        {
            for(int i =place1 - place2 -1;i>=0;i--)
            {
                if(s.charAt(i) == '?')
                temp = "a" + temp;
                else
                temp = s.charAt(i) + temp;
            }
            for(int j = (place1 + t.length()); j < s.length();j++)
            {
                if(s.charAt(j) == '?')
                temp += "a";
                else
                temp += s.charAt(j);
            }
            System.out.print(temp);
        }   
    }
}      