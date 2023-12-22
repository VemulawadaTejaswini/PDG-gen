import java.io.*;

class Main{
    public static void main (String[ ] args) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String str = br.readLine();
        int cnt = Integer.parseInt(str);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long sum = 0;
        str = br.readLine();
        String[] strArr = str.split(" ");
        for(int loop = 0; loop < cnt; loop++)
        {
            int i = Integer.parseInt(strArr[loop]);
            if(i < min)
            {
                min = i;
            }
            if(i > max)
            {
                max = i;
            }
            sum += i;
        }
        
        System.out.println(min + " " + max + " " + sum);
    }
}