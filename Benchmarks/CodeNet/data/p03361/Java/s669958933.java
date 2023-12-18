import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] cl = new boolean[h+2][w+2];
        boolean ans = true;
        String res;
        String str;
        char c;
        for(int i=1; i<h+1; i++){
            str = sc.next();
            for(int j=1; j<w+1; j++){
                c = str.charAt(j-1);
                if(c == '.') cl[i][j] = true;
                else         cl[i][j] = false;
            }
        }
        for(int i=0; i<h+2; i++){
            cl[i][0]  = true;
            cl[i][h+1] = true;
        }
        for(int i=0; i<w+2; i++){
            cl[0][i]  = true;
            cl[w+1][i] = true;
        }
        for(int i=1; i<h-1; i++){
            for(int j=1; j<w-1; j++){
                if(cl[i][j] == false && cl[i-1][j]==true && cl[i][j-1]==true 
                                     && cl[i+1][j]==true && cl[i][j+1]==true){
                    ans = false;
                }
            }
        }
        if(ans == true) res = "Yes";
        else           res = "No";
        System.out.println(res);
    }
}