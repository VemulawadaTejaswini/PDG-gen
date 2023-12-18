import java.util.*;
public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int z,x=0,c;
        boolean m=false;
        z=input.nextInt();
        String s=String.valueOf(z);
        for(int i=0;i<s.length();i++)
        {
            for(int r=0;r<i;r++)
            {
                if(s.charAt(i)==s.charAt(r))
                    x++;
            }
            if (x>=3)
            {
                System.out.println("Yes");
                m=true;
                break;
            }
        }
        if(!m)
            System.out.println("No");
    }
    
}
