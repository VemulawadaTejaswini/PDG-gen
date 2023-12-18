import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length()-4;i++)
        {
            for(int j=i+3;j<s.length();j++)
            {
                long temp=Long.parseLong(s.substring(i,j+1));
                if(temp%2019==0)
                    c++;
            }
        }
        System.out.println(c);
    }
}