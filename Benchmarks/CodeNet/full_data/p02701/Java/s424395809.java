import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set list = new HashSet()>();
        for(int i=0;i<N;i++){
            String str = sc.next();
            list.add(str);
        }

        
        
        System.out.println(list.size());
    }
}