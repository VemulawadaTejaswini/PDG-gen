
import java.util.Scanner;

 class Main {

    static int I, J;
    private static int recFunc(int i, int j){
        if(i==I && j==J){
            return 1;
        }
        if(i>I || j>J)
            return 0;
        return (recFunc(i+1, j+2) + recFunc(i+2, j+1));
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        I=in.nextInt();
        J=in.nextInt();
        int ans = recFunc(0,0);
        System.out.println(ans);
    }
}
