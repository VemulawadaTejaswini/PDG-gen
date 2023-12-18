import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] q = new int[b];
        String[] ans = new String[b];
        int[] c = new int[b];
        int wa=0;
        int ac=0;
        
        for(int i=0; i<b; i++){
            q[i] = sc.nextInt();
            ans[i] = sc.next();
            c[i] = 0;
        }
        
        int x=0;
        for(int i=0; i<b; i++){
            if(ans[i].equals("WA") && c[x]!=q[i]){
                wa++;
                //System.out.println(""+q[i]+c[x]);
            }else{
                if(c[x]!=q[i]){
                    ac++;
                    x++;
                    c[x]= q[i];
                }
            }
        }
        
        
        
        System.out.println(""+ac+" "+wa);
   }
}
