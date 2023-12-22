import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
    
        int x = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        var set = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            set.add(Integer.parseInt(sc.next()));
        }
        
        int a = x;
        while(set.contains(a)){
            a--;
        }
        int b = x;
        while(set.contains(b)){
            b++;
        }
        if(x-a <= b-x){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}