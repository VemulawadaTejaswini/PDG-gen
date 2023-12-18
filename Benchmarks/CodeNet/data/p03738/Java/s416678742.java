import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String A=sc.next();
String B=sc.next();
if(A.length()>B.length()){
    out.println("GREATER");
}else if(A.length()<B.length()){
    out.println("LESS");
}else{
int n=A.length();
int[] a=new int[n];
int[] b=new int[n];
    for (int i = 0; i < n; i++) {
        a[i]=Integer.parseInt(Character.toString(A.charAt(n-1-i)));
        b[i]=Integer.parseInt(Character.toString(B.charAt(n-1-i)));
    }
    int c=0;
    for (int i = 0; i < n; i++) {
        if(a[i]>b[i]){
        c++;
        }else if(a[i]<b[i]){
        c--;
        }
        if(c==1){
            out.println("GREATER");
        break;
        }else if(c==-1){
            out.println("LESS");
        break;
        }
    }
    if(c==0)out.println("EQUAL");
}
}
}