import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Main{


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Integer> temp =  new ArrayList<Integer>();

        int n = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");

        for(int i = 0; i < s.length; ++i)
        {
            if(i%2 == 0)
            {
                temp.add(Integer.parseInt(s[i]));
            }
            else
            {
                temp.add(0, Integer.parseInt(s[i]));
            }
        }
        
        if(n%2 == 1)
        {
            Collections.reverse(temp);
        }
        
        String res = "";

        for(int i = 0; i < temp.size() - 1; ++i)
        {
            res += temp.get(i) + " ";
        }
        res += temp.get(temp.size()-1);
        System.out.println(res);
    }
}