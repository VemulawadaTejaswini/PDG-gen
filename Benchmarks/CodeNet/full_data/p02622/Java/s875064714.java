import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)+"").equals(t.charAt(i)+""))
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
