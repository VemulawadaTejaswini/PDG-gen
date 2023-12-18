import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int K  =scan.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=Math.min(K,9);++i)ans.add(i);
        K-=9;
        int n=19;
        while(K-->0){
            ans.add(n);
            n+=10;
        }
        for(int k:ans)System.out.println(k);
    }
}