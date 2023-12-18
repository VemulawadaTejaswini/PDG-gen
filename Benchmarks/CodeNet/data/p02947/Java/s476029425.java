import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        String[] sortedS = new String[n];
        for(int i=0; i<n; i++){
            String s = stdIn.next();
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            sortedS[i] = new String(cs);
        }
        
        Arrays.sort(sortedS);

        long cnt = 0;
        for(int i=0; i<n-1; i++){
            if(!sortedS[i].equals(sortedS[i+1])){
                continue;
            }

            int j=i+1;
            while(true){
                if(!sortedS[i].equals(sortedS[j])){
                    while(!sortedS[i].equals(sortedS[j])){
                        j--;
                    }
                    break;
                }else{
                    j = j+100;
                    if(j>=n){
                        j = n-1;
                        while(!sortedS[i].equals(sortedS[j])){
                            j--;
                        }
                        break;
                    }
                }
            }
            cnt += nC2(j - i + 1);
            i = j;
        }

        System.out.println(cnt);
    }

    static long nC2(int n){
        return ((long)n * (long)(n-1)) / 2;
    }
}
