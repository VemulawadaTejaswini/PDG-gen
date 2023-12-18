import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                boolean ebishu = true;
                for(int i = 0 ; i < n && ebishu ; i++){
                        if(Integer.parseInt(sc.next()) % 2 != 0) ebishu = false;
                }
                sc.close();
                if(ebishu) ou.print("second\n");
                else ou.print("first\n");
                ou.flush();
        }
}