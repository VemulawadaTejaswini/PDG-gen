import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int[] front = new int[n];
        int[] back = new int[n];
        int ind = s.length-1;
        int cnt = 0;
        while(ind >= 0 && cnt < k){
            if(s[ind] == 'o'){
                back[ind]++;
                ind -= (c+1);
                cnt++;
            }else{
                ind--;
            }
        }
        ind = 0;
        cnt = 0;
        while(ind < s.length && cnt < k){
            if(s[ind] == 'o'){
                front[ind]++;
                ind += (c+1);
                cnt++;
            }else{
                ind++;
            }
        }
        for(int i = 0; i < n; i++){
            if(front[i] >= 1 && back[i] >= 1){
                System.out.println(i+1);
            }
        }
    }
}
