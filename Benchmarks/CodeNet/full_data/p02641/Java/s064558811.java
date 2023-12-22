import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n = sc.nextInt();
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i = 1; i <= n; i++){
           map.put(sc.nextInt(), 1);
       }
       if(n == 0){
           System.out.println(x);
       }
       else{
           int left = x;
           int right = x;
           while(map.containsKey(left) && map.containsKey(right)){
               left--;
               right++;
           }
           if(!map.containsKey(left)){
               System.out.println(left);
           }
           else{
               System.out.println(right);
           }
       }
    }
}