import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String str1 = br.readLine();
        String[] str2 = str1.split(" ", 0);
        double i[] = new double[3];

        for(int j=0; j<3; j++) {
        	i[j] = Integer.parseInt(str2[j]);
        	//System.out.println(i[j]);
        }

		double r = i[0] / (i[1] + i[2]);

       	System.out.println((int)r);
       
    }
}