import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //int N = sc.nextInt();
        int L = str.length();
        char[] c1 = new char[L];
        boolean test = true;
        
        for(int i=0; i<L; i++){
            c1[i] = str.charAt(i);
        }
        
        for(int i=0; i<(L-1)/2; i++){
            if(c1[i] != c1[L-(i+1)]){
                test = false;
            }
            if(c1[i] != c1[((L-1)/2)-(i+1)]){
                test = false;
            }
        }
        
        if(test){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(ans);
    }
}