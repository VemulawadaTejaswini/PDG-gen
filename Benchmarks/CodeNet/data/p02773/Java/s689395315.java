import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] str = new String[n];
        int[] count = new int[n];
        String[] ans = new String[n];
        int max = 0;
        
        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        
        Arrays.sort(str);
        
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(str[i].equals(str[j])){
                    count[i]++;
                }
            }
            if(max<count[i]){
                max = count[i];
            }
        }
        
        if(max==n){
            System.out.println(str[0]);
            return;
        }
        
        int a=0;
        for(int i=0; i<n; i++){
            if(max==count[i]){
                ans[i] = str[i];
                //System.out.println(ans[i]);
                a++;
            }
        }
        
        for(int i=1; i<a; i=i+max){
            System.out.println(ans[i+max]);
        }
   }
}
