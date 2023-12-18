import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      
      String str;
      String detec;
      
      //str = s.substring(1,3);
      
      int start = 0;
      int ans = 0;
      boolean exist = false;
      while(start+ans+1<=n) {
        str = s.substring(start,start+ans+1);
        for(int i=start+ans+1; i+ans<n; i++) {
          detec = s.substring(i,i+ans+1);
          if(str.equals(detec)) {
            ans = str.length();
            exist =true;
            break;
          }
        }
        if(!exist) start++;
        exist = false;
      }
      
      System.out.println(ans);
      
    }
}

