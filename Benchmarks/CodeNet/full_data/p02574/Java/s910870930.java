import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        boolean isPair = true;
        boolean isSet = false;
        int gcd = nums[0];
        for(int i=0; i<n; i++){
            if(!isSet){
                gcd = gcd(gcd, nums[i]);
                if(gcd==1){
                    isSet = true;
                }
            }
            if(isPair){
                for(int j=1; j*j<=nums[i]; j++){
                    if(nums[i]%j==0){
                        int o = nums[i]/j;
                        if(j!=1 && set.contains(j)){
                            isPair = false;
                            break;
                        }
                        if(o!=1 && set.contains(o)){
                            isPair = false;
                            break;
                        }
                        if(j!=1) set.add(j);
                        if(o!=1) set.add(o);
                    }
                }
            }
        }

        if(isPair){
            System.out.println("pairwise coprime");
        }
        else if(isSet){
            System.out.println("setwise coprime");
        }
        else{
            System.out.println("not coprime");
        }
    }

    private static int gcd(int a, int b){
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        if(min==0){
            return max;
        }
        return gcd(max%min, min);
    }
}
