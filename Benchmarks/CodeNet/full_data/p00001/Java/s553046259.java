import java.io.*;
import java.util.Arrays;
class Main {
    public static void main(String[] args)throws IOException
    {
        BufferedReader var=new BufferedReader(new InputStreamReader(System.in));
int vec[]=new int[10];
for(int c=0;c<10;c++)
    {
vec[c]=Integer.parseInt(var.readLine());
}
Arrays.sort(vec);
    System.out.println(vec[9]);
        System.out.println(vec[8]);
            System.out.println(vec[7]);
    }
}