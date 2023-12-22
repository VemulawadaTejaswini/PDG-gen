import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{

            int sn = Integer.parseInt(reader.readLine());
            String[] str_s = reader.readLine().split(" "); 
            int tn = Integer.parseInt(reader.readLine());
            String[] str_t = reader.readLine().split(" "); 

            Set<Integer> set_s = new HashSet<Integer>();
            Set<Integer> set_t = new HashSet<Integer>();

            for (int i=0; i<sn; i++)
                set_s.add(Integer.parseInt(str_s[i]));

            for (int i=0; i<tn; i++)
                set_t.add(Integer.parseInt(str_t[i]));

            Set<Integer> inter = new HashSet<Integer>(set_s);
            inter.retainAll(set_t);
            System.out.println(inter.size());
           
        }

}