import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        String s = scan.next();
        String t = scan.next();

        String S = s;
        String T = t;

        if(S.length() < T.length()){
            while(S.length() + s.length() <= T.length())S += s;
            S += s.substring(0,T.length() - S.length());
        }else if(T.length() < S.length()){
            while(T.length() + t.length() <= S.length())T += t;
            T += t.substring(0,S.length() - T.length());
        }

        if(T.compareTo(S)<0){
            String w = t;
            t = s;
            s = w;
        }
        int Lt = L % s.length();
        while(Lt % t.length() != 0)Lt += s.length();
        int Ls = L - Lt;

        String ans = "";
        for(int i=0;i<Ls/s.length();++i)ans += s;
        for(int i=0;i<Lt/t.length();++i)ans += t;
        System.out.println(ans);

    }
}