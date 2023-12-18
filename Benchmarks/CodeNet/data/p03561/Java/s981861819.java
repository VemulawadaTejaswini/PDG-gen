import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{

    static int K;

    static boolean dec(ArrayList<Integer> list, int digit){
        int pos = list.size()-1-digit;
        if(list.get(pos)==0){
            if(dec(list, digit+1))list.set(pos, K);
        }else{
            list.set(pos, list.get(pos)-1);
        }
        if(list.get(pos)>0)return true;
        return false;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
        int N =scan.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        if(K%2==0){
            ans.add(K/2);
            while(N-->1)ans.add(K);
        }else{
            for(int i=0;i<N;++i)ans.add((K+1)/2);
            for(int i=0;i<(N/2);++i){
                dec(ans, 0);
            }
        }
        PrintWriter pw = new PrintWriter(System.out);
        for(int i : ans)if(i!=0)pw.print(i+" ");
        pw.println();
        pw.flush();
    }
}