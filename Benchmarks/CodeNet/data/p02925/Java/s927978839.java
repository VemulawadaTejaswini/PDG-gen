import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[][] = new int[n][n - 1];
        int now[] = new int[n];
        int count = 0;
        boolean flag = true;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                a[i][j] = stdIn.nextInt();
            }
            now[i] = 0;
        }
        
        for(int i = 0; i < n;){
            
            //System.out.println(i + " " + now[i]);
            
            int ene = a[i][now[i]];
            if(a[ene - 1][now[ene - 1]] == i + 1){
                now[i]++;
                now[ene - 1]++;
                count++;
            }else{
                flag = false;
                //System.out.println(ene - 1 + " " + i);
                break;
            }
            
            int min = now[0];
            int pos = 0;
            for(int j = 1; j < n; j++){
                //System.out.println(min + " " + now[j]);
                if(min > now[j]){
                    min = now[j];
                    pos = j;
                }
                
                if(now[i] == n){
                    count++;
                }
            }
            i = pos;
            if(count == n){
                break;
            }
            
            // System.out.println(min);
        }
        
        
        if(flag){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}
