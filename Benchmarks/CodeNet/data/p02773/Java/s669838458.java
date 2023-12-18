import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {



    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();
        HashMap<String,Integer> hm = new HashMap<>();
        int max =0;
      for(int ii=0; ii<test; ii++){
         String s = sc.next();
         if(hm.containsKey(s)){
             Integer x = hm.get(s);
             x++;
             hm.put(s,x);
             if(x > max)
                 max = x;
         }else {
             hm.put(s, 1);
             if (1 > max)
                 max = 1;
         }
      }
      String ans[] = new String[test];int k=0;
      Arrays.fill(ans," ");
      for(Map.Entry<String,Integer> map : hm.entrySet()){
          int y = map.getValue();
          if(y == max)
             ans[k++] = map.getKey();
      }
      Arrays.sort(ans);
      for(String s : ans)
          if(!s.equals(" "))
            System.out.println(s);
    }
}