import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    boolean flag=true;
    for (int i = 0; i <=b; i++) {
        if((a*i)%b==c){
        flag=true;
        break;
        }else{
        flag=false;
        }
    }
    if(flag){
        out.println("YES");
    }else{
        out.println("NO");   
    }
}
}