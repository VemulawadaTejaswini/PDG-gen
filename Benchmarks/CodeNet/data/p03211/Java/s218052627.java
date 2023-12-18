import java.io.*;
import java.util.*;

class Program{
    String S[];
    ArrayList<Integer> sub = new ArrayList<>();
    int diff = Integer.MAX_VALUE;
    void solve(String S[]){
        for(int i = 0;i<=S.length-3;i++){
            diff = Math.min(diff,Math.abs(753 - Integer.parseInt( S[i]+S[i+1]+S[i+2] )) );        
        }
        System.out.println(diff);
    }
}
class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner in = new Scanner(System.in);
        obj.solve(in.nextLine().split(""));
    }
}