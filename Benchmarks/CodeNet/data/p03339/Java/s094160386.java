import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String s = sc.next();
        
        int[] r = new int[n];
        
        for(int i = 0; i < n; i++){
            int res = 0;
            
            for(int j = 0; j < n; j++){
                char c = s.charAt(j);
                if(i != j){
                    if(i > j){
                        if(c == 'W'){
                            res++;
                        }
                    }else if(i < j){
                        if(c == 'E'){
                            res++;
                        }
                    }
                }
            }
            r[i] = res;
        }
        
        System.out.println(Arrays.stream(r).min().getAsInt());
    }


}
