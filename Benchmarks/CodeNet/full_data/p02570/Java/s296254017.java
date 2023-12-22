

import java.util.Map.Entry;
import java.lang.reflect.Method;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayList;

//import org.w3c.dom.css.Counter;

public class Main {
    // public class App {

    public static void main(final String[] args)throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final Scanner s = new Scanner(System.in);
        int D = Integer.parseInt(s.next());
        int T = Integer.parseInt(s.next());
        int S = Integer.parseInt(s.next());
        if(D > T*S){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }
}