

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        BufferedReader bf;
        try {
                bf = new BufferedReader(new FileReader("in1.log"));
        }
        catch (FileNotFoundException e)
        {
            bf = new BufferedReader(new InputStreamReader(System.in));
        }

        try {
            pA p = new pA( bf.readLine());
            if(p.res==2)
                System.out.println("Yes");
            else {
                System.out.println("No");
            }
        } catch (IOException e) {
            System.exit(0);
        }
    }

}
class pA {
    int res;
    char[] bucket;
    pA() {} ;
    pA(String msg)
    {
        res=0;
        bucket=new char[msg.length()];
        for(int i=0;i<msg.length();i++)
        {
            bucket[i]=msg.charAt(i);
        }
        solver();
    }
    int solver()
    {
        boolean duplicateFlag=false;
        for(int i=0;i<bucket.length;i++)
        {
            duplicateFlag=false;
            for(int j=0;j<i;j++)
            {
                if(bucket[i]==bucket[j])
                    duplicateFlag=true;
            }
            if(duplicateFlag==false)
                res+=1;
        }
        return 0;
    }
}
