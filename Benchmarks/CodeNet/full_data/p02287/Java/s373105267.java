import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] heap_list = new int [n+1];
        for(int i=1;i<=n;i++) heap_list[i] = sc.nextInt();
        for(int i=1;i<=n;i++){
            StringBuilder s = new StringBuilder();
            s.append("node "+i+": key = "+heap_list[i]+", ");
            if(i/2>0) s.append("parent key = "+heap_list[i/2]+", ");
            if(i*2<=n) s.append("left key = "+heap_list[i*2]+", ");
            if(i*2+1<=n) s.append("right key = "+heap_list[i*2+1]+", ");
            System.out.println(s);
        }
    }
}
