import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cur = new int[4];
        for(int i=3;i>=0;i--){
            cur[i] = N%10;
            N = N/10;
        }
        String ans = "No";
        if(cur[0]==cur[1]&&cur[1]==cur[2]) ans = "Yes";
        if(cur[1]==cur[2]&&cur[2]==cur[3]) ans = "Yes";
        System.out.println(ans);
    }
}
