import java.io.*;
import java.math.*;

class Main{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        int[] data1 = makeint(br);
        int n = data1[0];
        int[] data2 = makeint(br);
        long minimum = data2[0], maximum = data2[0], sum = data2[0];

        for(int i = 1; i < n; i++){
            minimum = Math.min(minimum, data2[i]);
            maximum = Math.max(maximum, data2[i]);
            sum += data2[i];
        }
        System.out.println(minimum + " " + maximum + " " + sum);
    }

    public static int[] makeint(BufferedReader br) throws IOException
    {
        String[] str = br.readLine().split(" ");
        int n = str.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){ a[i] = Integer.parseInt(str[i]); }
        return a;
    }
}
