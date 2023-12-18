import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        int[] ten = new int[n];//yoitenboudai ccount i
        int[] ten2 = new int[n];//detekitara 1
        int cnt =0; 
        
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
        }

        for(int i = 0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            ten2[a-1] = 1;
            ten2[b-1] = 1;
            if(h[a-1]<h[b-1]){
                ten[b-1] = 1;
            }else if(h[a-1]>h[b-1]){
                ten[a-1] = 1;
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
            if(ten[i]==1){
                cnt++;
                //System.out.println("Yess"+i);
            }
            if(ten2[i]==0){
                cnt++;
                //System.out.println("Noo"+i);
            }
        }

        System.out.println(cnt);
        
    }
}