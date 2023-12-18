import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int H=Integer.parseInt(sc.next());
int W=Integer.parseInt(sc.next());
char[][] s=new char[H][W]; 
for (int i = 0; i < H; i++) {
    String p=sc.next();
        for (int j = 0; j < W; j++) {
        s[i][j]=p.charAt(j);
    }
}
if(H==1&&W==1){if(s[0][0]=='.'){System.out.println(0);}else{System.out.println("#");}}else{
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        int c=0;
        if (s[i][j]=='.') {
            if(i!=0&&j!=0&&i!=H-1&&j!=W-1){
            if(s[i+1][j+1]=='#')c++;
            if(s[i-1][j+1]=='#')c++;
            if(s[i+1][j-1]=='#')c++;
            if(s[i-1][j-1]=='#')c++;
            if(s[i][j+1]=='#')c++;
            if(s[i][j-1]=='#')c++;
            if(s[i-1][j]=='#')c++;
            if(s[i+1][j]=='#')c++;
            }else if(i==0&&j==0){
            if(s[0][1]=='#')c++;
            if(s[1][1]=='#')c++;
            if(s[1][0]=='#')c++;
            }else if(i==0&&j==W-1){
            if(s[0][W-2]=='#')c++;
            if(s[1][W-2]=='#')c++;
            if(s[1][W-1]=='#')c++;
            }else if(i==H-1&&j==0){
            if(s[H-2][0]=='#')c++;
            if(s[H-2][1]=='#')c++;
            if(s[H-1][1]=='#')c++;
            }else if(i==H-1&&j==W-1){
            if(s[H-1][W-2]=='#')c++;
            if(s[H-2][W-1]=='#')c++;
            if(s[H-2][W-2]=='#')c++;
            }else if(i==0){
            if(s[i][j-1]=='#')c++;
            if(s[i+1][j-1]=='#')c++;
            if(s[i+1][j]=='#')c++;
            if(s[i+1][j+1]=='#')c++;
            if(s[i][j+1]=='#')c++;
            }else if(i==H-1){
            if(s[i][j-1]=='#')c++;
            if(s[i-1][j-1]=='#')c++;
            if(s[i-1][j]=='#')c++;
            if(s[i-1][j+1]=='#')c++;
            if(s[i][j+1]=='#')c++;
            }else if(j==0){
            if(s[i-1][j]=='#')c++;
            if(s[i-1][j+1]=='#')c++;
            if(s[i][j+1]=='#')c++;
            if(s[i+1][j+1]=='#')c++;
            if(s[i+1][j]=='#')c++;
            }else if(j==W-1){
            if(s[i-1][j]=='#')c++;
            if(s[i-1][j-1]=='#')c++;
            if(s[i][j-1]=='#')c++;
            if(s[i+1][j-1]=='#')c++;
            if(s[i+1][j]=='#')c++;
            }
        s[i][j]=(char)(c+48);
        }
    }
}
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            System.out.print(s[i][j]);
        }System.out.println();
    }
}
}
}
