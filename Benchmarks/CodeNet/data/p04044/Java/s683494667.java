import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = Integer.parseInt(sc.next());
int l = Integer.parseInt(sc.next());
String[] s=new String[n];
for(int i=0;i<n;i++){s[i]=sc.next();}
Arrays.sort(s);
for(String i:s){out.print(i);}
out.println();
}}
