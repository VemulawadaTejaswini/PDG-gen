import java.io.*;
import java.util.*;
public class Main{
public static void main(String[]args) throws IOException{
BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(cin.readLine());
int a = Integer.parseInt(st.nextToken());
int b = Integer.parseInt(st.nextToken());
int c = Integer.parseInt(st.nextToken());
boolean ret = false;
if(a == b)
if(b==c) ret = false;
else ret = true;
if(b==c) 
if(a==b) ret = false;
else ret = true;
if(a==c)
if(a==b) ret = false;
else ret = true;
if(ret) System.out.println("Yes");
else System.out.println("No");
}
}
