import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc  = new Scanner(System.in);
 
        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        int count = 0;
 
        for (int x=0;x<K+1;x++){
            for (int y=0;y<K+1;y++){
                 if(x+y==S) count++;  
            }
        } 
 
        if(S == K*3) System.out.print("1");
 
        else System.out.print(count*2);
        System.out.println();
    }
 
}