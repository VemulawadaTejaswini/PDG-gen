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
            for(int r=i;r<4;r++)
            {
                if(s.charAt(i)==s.charAt(r))
                {
                    x++;
                    if(x==3)
                        break;
                }
                else x--;
            }
            if (x>2)
            {
                System.out.println("Yes");
                m=true;
                break;
            }
            x=0;
        }
        if(!m)
            System.out.println("No");
    }
    
}
