import java.util.Scanner;

class Solver{
    private final int N;
    private final int SS;
    private final int FS;
    private final int SG;
    private final int FG;
    private final String S;

    Solver(Scanner in){
        N = in.nextInt();
        SS = in.nextInt() - 1;
        FS = in.nextInt() - 1;
        SG = in.nextInt() - 1;
        FG = in.nextInt() - 1;
        S = in.next();
    }

    void solve(){
        String s = S.substring(SS, Math.max(SG, FG));
        if(s.contains("##")){
            System.out.println("No");
        }else if(SG > FG){
            int space = s.indexOf("...", FS - 1);
            if(space < 0 || space > FG - 1){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }else System.out.println("Yes");
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}