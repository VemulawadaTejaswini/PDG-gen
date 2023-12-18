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
        ArrayList<Integer> back = new ArrayList<Integer>();
        int ind = s.length-1;
        while(ind >= 0 && back.size() < k){
            if(s[ind] == 'o'){
                back.add(ind);
                ind -= c+1;
            }else{
                ind -= 1;
            }
        }
        ind = 0;
        int cnt = 0;
        while(ind < s.length && cnt < k){
            if(s[ind] == 'o'){
                if(back.contains(ind)){
                    System.out.println(ind+1);
                }
                ind += c+1;
                cnt++;
            }else{
                ind += 1;
            }
        }
    }

}
