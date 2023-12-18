import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String Sa=sc.next();
String Sb=sc.next();
String Sc=sc.next();
int a=Sa.length(),b=Sb.length(),c=Sc.length();
char p=Sa.charAt(Sa.length()-a);
a--;
while(true){
    switch(p){
        case 'a':
            if(a==0){
                out.println("A");
                exit(0);
            }
            p=Sa.charAt(Sa.length()-a);
            a--;
            break;
        case 'b':
            if(b==0){
                out.println("B");
                exit(0);
            }
            p=Sb.charAt(Sb.length()-b);
            b--;
            break;
        case 'c':
            if(c==0){
                out.println("C");
                exit(0);
            }
            p=Sc.charAt(Sc.length()-c);
            c--;
            break;
    }
}
}}