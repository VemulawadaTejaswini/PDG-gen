import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong(), w = sc.nextLong();
        
        long hh = h/2;
        
        long result = w * hh;
        if(h%2!=0){
          long ww = w/2;
          if(w%2!=0){
              ww++;
          }
          result += ww;
        }
        
        
        System.out.println(result);
    }
}
