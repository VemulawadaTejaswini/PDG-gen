import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String S = buffer.readLine();
        String T = buffer.readLine();
        int  minLen = Integer.MAX_VALUE;
        for (int pos = 0; pos < S.length(); pos++) {
            int index = T.indexOf(S.charAt(pos));
            if (index==-1||(index+1)>pos||(T.length()-index)>(S.length()-pos))continue;
            int currLen = index, tempPos = pos;
            for (; index < T.length() && tempPos<S.length(); index++, tempPos++) {
                if (S.charAt(tempPos)!=T.charAt(index))currLen++;
            }
            minLen = Math.min(minLen, currLen);
        }
        System.out.println(minLen);
    }
}
