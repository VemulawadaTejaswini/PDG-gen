import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args)throws IOException{
    	int a, b, s, l; // s:??¢???, l:??¨?????????
    	InputStreamReader isr =new InputStreamReader(System.in);
   		BufferedReader br =new BufferedReader(isr);
        String buf = br.readLine();
        StringTokenizer st = new StringTokenizer(buf," ");
    	a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    	s = a*b;
    	l = (a + b) * 2;
        System.out.printf("%d %d\n", s, l);
    }
}