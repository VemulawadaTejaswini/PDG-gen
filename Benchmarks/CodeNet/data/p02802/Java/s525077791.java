import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] a = new int[n];
        int[] pena = new int[n];
        int clear = 0;
        int total = 0;
        for(int i = 0; i < m; i++){
            int pm = scn.nextInt()-1;
            String sm = scn.next();
            if(a[pm] == 1){
                
            }else if(sm.equals("AC")){
                clear++;
                a[pm]=1;
            }else{
                pena[pm]++;
            }
        }
        int penalty = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == 1){
                penalty += pena[i];
            }
        }
        System.out.println(clear+" "+penalty);
        
    }
}
