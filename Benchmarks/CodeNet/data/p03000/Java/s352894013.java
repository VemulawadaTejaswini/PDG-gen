import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int now = 0;
        int count = 0;
        while(now <= m && n>0){
            int i = sc.nextInt();
            now += i;
            count++;
            n--;
        }
        sc.close();
        if(now <= m){
            System.out.println(count+1);
        }else{        
            System.out.println(count);
        }
    }
}