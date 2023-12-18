import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        long p,x,xx,c;
        p=ss.nextLong(); x=ss.nextLong(); xx=ss.nextLong();
        if(x>xx){
            c=xx;
            xx=x;
            x=c;
        }
        
        
        p+=x;
        xx-=p;
        if(xx<0) xx=0;
        System.out.println(xx);
    }
}