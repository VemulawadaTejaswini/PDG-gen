import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.math.BigInteger;
class HHAL
{
	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
      	if(t%2==0)
          System.out.println(t);
      	else
          System.out.println(2*t);
    }
}