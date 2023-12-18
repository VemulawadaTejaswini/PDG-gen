import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(1);
            return;
        }
        List<Long> li = new ArrayList<Long>(){{add((long)2);add((long)1);}};
        int ans = Integer.MAX_VALUE;
        for(int i = 2; i < n; i++){
            li.add(li.get(i-2) + li.get(i-1));
        }
        System.out.println(li.get(n-2) + li.get(n-1));
    }
}
 