import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        p[0] =0;
        p[1] =0;
        for(int j =0; j< n;j++){
            p[j] = sc.nextInt();
        }

        long ans = 0;
        for(int i =0; i< n;i++){
           try{ if(abs(p[i+1] - p[i]) +abs(p[i+2] -p[i])> abs(p[i+2] - p[i])){
                ans +=abs(p[i+2] - p[i]);
                i++;
            }else{
                ans +=abs(p[i+1] - p[i]);
            }
                
           }catch (ArrayIndexOutOfBoundsException e){
              break;
           }
        }
        System.out.println(ans);

        }
    }