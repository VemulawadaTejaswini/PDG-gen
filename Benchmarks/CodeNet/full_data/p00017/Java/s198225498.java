import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String toks = in.readLine().trim();
        int offset = 0;
        String finalStr = "";

        while(offset < 26)
        {
            StringBuilder tmpStr = new StringBuilder();
            int tmp;
            for(int j = 0; j<toks.length();j++)
            {
                tmp = (int)toks.charAt(j);
                if(tmp > 96 && tmp < 123)
                {   
                    tmp += offset;
                    if (tmp > 122)
                    {
                        tmp -=26;
                    }
                }
                tmpStr.append((char)tmp);
            }
            finalStr = tmpStr.toString();
            if (finalStr.contains(" the ") || finalStr.contains(" this ") || finalStr.contains(" that ")
            || finalStr.contains("the ") || finalStr.contains("this ") || finalStr.contains("that ")
            || finalStr.contains(" the") || finalStr.contains(" this") || finalStr.contains(" that"))
            {
                break;
            }

            offset++;
        }

       System.out.println(finalStr);


    }
}