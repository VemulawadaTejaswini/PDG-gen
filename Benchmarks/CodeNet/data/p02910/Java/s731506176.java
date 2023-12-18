import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length(); 
        String[] SS = new String[N];
        String A = "Yes";
        for(int i = 0; i < N; i++) {
            String str = String.valueOf(S.charAt(i));
        SS[i] = str;
        }

        if(N%2 == 1){
        for(int i = 0; i < N-2; i = i+2){
            if(SS[i].equals("L")) A = "No";
            if(SS[i+1].equals("R")) A = "No";
        }
        if(SS[N-1].equals("L")) A = "No";
    }else{
        for(int i = 0; i < N; i = i+2){
            if(SS[i].equals("L")) A = "No";
            if(SS[i+1].equals("R")) A = "No";
        }
    }
        System.out.println(A);
    }
}