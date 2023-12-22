import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                PrintWriter ou = new PrintWriter(System.out);
                long n = Long.parseLong(sc.next());
                sc.close();
                String s = "";
                boolean ebishu = true;
                while(ebishu){
                        if(n <= 0) ebishu = false;
                        else{
                                int i =(int) (n % (long)26);
                                if(i == 0) i += 26;
                                char q = (char)(i + 96);
                                s = q + s;
                                n--;
                                n /= 26;
                        }
                }
                ou.print(s + "\n");
                ou.flush();
        }
}