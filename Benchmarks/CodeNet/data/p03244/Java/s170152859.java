import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] eve = new int[n/2];
        int[] odd = new int[n/2];
        for(int i = 0; i < n/2; i++){
            eve[i] = a[i*2];
        }
        for(int i = 0; i < n/2; i++){
            odd[i] = a[i*2 + 1];
        }
        Arrays.sort(eve);
        Arrays.sort(odd);
        int countE = 1;
        int countO = 1;
        int CE = 1;
        int CO = 1;
        int mojiE = 0;
        int mojiO = 0;
        int me = 1;
        int mo = 1;
        for(int i = 1; i < n/2; i++){
            if(eve[i] == eve[i-1]){
                countE ++;
            }else{
                if(countE >= CE){
                    CE = countE;
                    mojiE = eve[i-1];
                }else{
                    if(countE >= me){
                        me = countE;
                    }
                }
                countE = 1;
            }
            if(countE == n/2){
                CE = n/2;
                mojiE = eve[0];
            }
        }
        for(int i = 1; i < n/2; i++){
            if(odd[i] == odd[i-1]){
                countO ++;
            }else{
                if(countO >= CO){
                    CO = countO;
                    mojiO = odd[i-1];
                }else{
                    if(countO >= mo){
                        mo = countO;
                    }
                countE = 1;
            }
            if(countO == n/2){
                CO = n/2;
                mojiO = odd[0];
            }
        }
        int ans = 0;
        if(mojiE != mojiO){
            ans = n - CE - CO;
        }else{
            if(CE > CO){
                ans = n - CO - me;
            }else{
                ans = n - CE - mo;
            }
        }
        System.out.println(ans);
    }
    }
    
}
