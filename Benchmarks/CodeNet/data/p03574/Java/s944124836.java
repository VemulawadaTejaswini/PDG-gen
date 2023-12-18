import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int H=Integer.parseInt(sc.next());
int W=Integer.parseInt(sc.next());
char[][] s=new char[H][W]; 
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            String p=sc.next();
            if (p.charAt(j)=='.') {
                s[i][j]='0';
            }else{
            s[i][j]='#';
            }
        }
    }
int[] dx={-1,-1,-1,0,0,1,1,1};
int[] dy={-1,0,1,1,-1,-1,0,1};
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            if(s[i][j]=='#'){
                for (int k = 0; k <8; k++) {
                   if(0<=i+dy[k]&&i+dy[k]<=H-1&&0<=j+dx[k]&&j+dx[k]<=W-1){
                       s[i+dy[k]][j+dx[k]]+=1;
                   }
                }
            }
        }
    }
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            out.print(s[i][j]);
        }out.println();
    }
}
}