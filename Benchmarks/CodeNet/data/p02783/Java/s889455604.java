import javax.tools.*;
import java.io.*;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class Main{

    public static void main(String[] args)  {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a/b;
            if(res*b<a){
                ++res;
            }
            System.out.println(res);
    }
}

