import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        boolean[] ac = new boolean[n+1];
        int[] wa = new int[n+1];
        int a = 0;
        for(int i = 0; i < m; i++){
            int p = Integer.parseInt(sc.next());
            String s = sc.next();
            if(!ac[p]){
                if(s.equals("AC")){
                    a++;
                    ac[p] = true;
                }else{
                    wa[p]++;
                }
            }
        }
        
        int penalty = 0;
        for(int i = 1; i <= n; i++){
            if(ac[i]){
                penalty += wa[i];
            }
        }
        
        System.out.println(a + " " + penalty);
    }
}