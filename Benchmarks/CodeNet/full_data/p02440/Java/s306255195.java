import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            a.add(Integer.parseInt(sc.next()));
        }
        
        int q = Integer.parseInt(sc.next());
        int com,b,e,min,max;
        for(int i=0; i<q; i++){
            com = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            e = Integer.parseInt(sc.next());
            min = a.get(b);
            max = a.get(b);
            
            for(int j=b; j<e; j++){
                if(com == 0) min = Math.min(min,a.get(j));
                else max = Math.max(max,a.get(j));
            }
            if(com == 0) System.out.println(min);
            else System.out.println(max);
        }
    }

}

