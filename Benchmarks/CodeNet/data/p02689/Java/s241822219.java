import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        boolean[] ten = new boolean[n];//yoitenboudai ccount i
        int cnt =0; 
        
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
            ten[i] = true;
        }

        for(int i = 0;i<m;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(h[a]<h[b]){
                ten[a] = false;
            }else if(h[a]>h[b]){
                ten[b] = false;
            }else{
                ten[a] = false;
                ten[b] = false;
            }
        }

 /*       for(int i = 0;i<n;i++){
            System.out.println("ten["+i+"]="+ten[i]);

        }
       for(int i = 0;i<n;i++){
           System.out.println("ten2["+i+"]="+ten2[i]);
      }
*/
        for(int i = 0;i<n;i++){
            if(ten[i]){
                cnt++;
                //System.out.println("Yess"+i);
            }

        }

        System.out.println(cnt);
        
    }
}
