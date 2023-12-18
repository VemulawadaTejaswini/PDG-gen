import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int H=sc.nextInt();
int W=sc.nextInt();
int[][] a=new int[H][W];
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        a[i][j]=sc.nextInt();
    }
}
String[] s=new String[W*H];
int c=0;
for (int i = 0; i < H; i++) {
    for (int j = 0; j < W; j++) {
        if(a[i][j]%2!=0){
            if(i!=H-1){
                s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+2)+" "+String.valueOf(j+1);
                
                a[i][j]--;
                a[i+1][j]++;
            }else if(j!=W-1){
                s[++c]=String.valueOf(i+1)+" "+String.valueOf(j+1)+" "+String.valueOf(i+1)+" "+String.valueOf(j+2);
                
                a[i][j]--;
                a[i][j+1]++;
            }
        }
    }
}
s[0]=String.valueOf(c);
for (int j = 0; j <= c; j++) {
    out.println(s[j]);
}
}
}
