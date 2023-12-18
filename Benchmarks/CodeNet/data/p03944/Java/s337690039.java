import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int W = Integer.parseInt(sc.next());
    int H= Integer.parseInt(sc.next());
    int n= Integer.parseInt(sc.next());
int[] x=new int[n];
int[] y=new int[n];
int[] a=new int[n];
int[][] c=new int[W][H];
    for (int i = 0; i < W; i++) {
        for (int j = 0; j <H; j++) {
            c[i][j]=1;
        }
    }
    for (int i = 0; i <n; i++) {
        x[i]=Integer.parseInt(sc.next());
        y[i]=Integer.parseInt(sc.next());
        a[i]=Integer.parseInt(sc.next());
    }
int ans=0;
    for (int i = 0; i < n; i++) {
        if(a[i]==1){
            for (int j = 0; j <H ; j++) {
                for (int k = 0; k <x[i]; k++) {
                    c[k][j]=0;
                }
            }
        }else if(a[i]==2){
            for (int j = 0; j < H; j++) {
                for (int k=W-1; k >=x[i]; k--) {
                    c[k][j]=0;
                }
            }
        }else if(a[i]==3){
            for (int j = 0; j < W; j++) {
                for (int k = 0; k < y[i]; k++) {
                    c[j][k]=0;
                }
            }
        }else{
            for (int j = 0; j < W; j++) {
                for (int k = H-1; k >=y[i]; k--) {
                    c[j][k]=0;
                }
            }
        }
    }
    for (int i = 0; i < W; i++) {
        for (int j = 0; j < H; j++) {
            ans+=c[i][j];
        }
    }
out.println(ans);
}
}