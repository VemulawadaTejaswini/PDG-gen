import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int sum=0;
        int day=0;
        
        while(sum < c){
            day++;
            sum += a;
            if(day % 7 == 0) sum += b;
        }
        System.out.println(day);
    }

}

