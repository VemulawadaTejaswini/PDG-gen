import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] res;
    ArrayList<Integer>[] tree;
    int[] ans;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        out.println(main.solve());
        out.flush();
    }
    void solve(){
        int n = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++) arr[i] = sc.next();
        int[] ab = new int[n+1], bc = new int[n+1], ac = new int[n+1];
        for(int i=n-1;i>=0;i--){
            ab[i] = ab[i+1]; bc[i] = bc[i+1]; ac[i] = ac[i+1];
            if(arr[i].equals("AB")) ab[i]++;
            else if(arr[i].equals("BC")) bc[i]++;
            else ac[i]++;
        }
        List<Character> list = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            if(arr[i].equals("AB")){
                if(A==0||B==0){
                    if(A==B){
                        out.println("No"); return;
                    }
                    if(A==0){
                        A++; B--; list.add('A');
                    } else{
                        A--;B++;list.add('B');
                    }
                } else{
                    if(A-ac[i+1]<=B-bc[i+1]){
                        A++; B--; list.add('A');
                    } else{
                        A--; B++;list.add('B');
                    }
                }
            } else if(arr[i].equals("AC")){
                if(A==0||C==0){
                    if(A==C){
                        out.println("No"); return;
                    }
                    if(A==0){
                        A++; C--; list.add('A');
                    } else{
                        A--; C++; list.add('C');
                    }
                } else{
                    if(A-ab[i+1]<=C-bc[i+1]){
                        A++;C--;list.add('A');
                    } else{
                        A--;C++;list.add('C');
                    }
                }
            } else{
                if(B==0||C==0){
                    if(B==C){
                        out.println("No");return;
                    }
                    if(B==0){
                        B++;C--;list.add('B');
                    } else{
                        B--;C++;list.add('C');
                    }
                } else{
                    if(B-ab[i+1]<=C-ac[i+1]){
                        B++;C--;list.add('B');
                    } else{
                        B--;C++;list.add('C');
                    }
                }
            }
        }
        out.println("YES");
        for(char c:list) out.println(c);
    }
}

