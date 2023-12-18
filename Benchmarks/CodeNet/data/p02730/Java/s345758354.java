import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);        
        String S = sc.next();

        LinkedList<String> string = new LinkedList<String>();

        for(int i=0; i<S.length(); i++){
            String s1 = "";
            s1 = String.valueOf(S.charAt(i));
            string.push(s1);
        }
        
        int N = S.length();
        StringBuilder sb1 = new StringBuilder();
        for (int i=0; i<(N-1)/2; i++){
            sb1.append(string.get(i));
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i=(N+3)/2-1; i<N; i++){
            sb2.append(string.get(i));
        }

        String s1 = sb1.toString();
        String s2 = sb2.toString();

        if(s1.equals(s2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}