import java.io.*;
import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
int d=Integer.parseInt(br.readLine());


int area=a*b;
int area1=c*d;
 if(area>=area1)
System.out.println(area);
else if(area<area1)
System.out.println(area1);

}}