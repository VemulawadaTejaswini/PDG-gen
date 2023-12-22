import java.util.*;
public class Main {

    static int[] f = null;

    static int rhs(int a, int b, int c){
        return ((a*a)+(b*b)+(c*c)+(a*b)+(b*c)+(a*c));
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt(); 
        int max = (int)Math.sqrt(NOC);
        f = new int[NOC];
        Arrays.fill(f,0);
        while(NOC-->0){
            int n = NOC+1;
            int count = 0; 
            // Can we do better? I dont know..
            for(int i=1; i<=max;i++){
                for(int j=1; j<=max; j++){
                    for(int k=1; k<=max; k++){
                        int val = rhs(i,j,k);
                        if(val>n) break;
                        else if(val==n) count++;
                    }
                }
            }
            f[NOC]=count;
        }
        for(int a: f) System.out.println(a);
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}