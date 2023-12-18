import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        char[] element = new char[N];
        String S = sc.next();
        for(int i=0;i<N;i++){
            element[i] = S.charAt(i);
        }
        ArrayList<Character> result = new ArrayList<>();
        int l = 0;
        for(int i=0;i<N;i++){
            if(element[i] == '('){
                l++;
                result.add('(');
            }
            else{
                if(l>0){
                    l--;
                    result.add(')');
                }
                else{
                    result.add(')');
                    result.add(0,'(');
                }
            }
        }
        for(char e : result){
            System.out.print(e);
        }
    }
}