import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // int T;
        // T=in.nextInt();
        // while((T--)>0)
        // {
        //     //code comes here

        // }   
            int TH,TS,HH,HS;
            TH=in.nextInt();
            TS=in.nextInt();
            HH=in.nextInt();
            HS=in.nextInt();
            int turnTaka=TH/HS;
            if(TH%HS!=0)
            ++turnTaka;
            int turnHaya=HH/TS;
            if(HH%TS!=0)
            ++turnHaya;
            if(turnHaya<=turnTaka)
            System.out.println("Yes");
            else
            System.out.println("No");

    }

}