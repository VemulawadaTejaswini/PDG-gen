import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        char[] U = new char[n];
        boolean bool = false;
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            U[i]=sc.next().charAt(0);
        }
        int u = 0;
        int r = 0;
        int d = 0;
        int l = 0;
        int[] Ux = new int[n];
        int[] Uy = new int[n];
        int[] Rx = new int[n];
        int[] Ry = new int[n];
        int[] Dx = new int[n];
        int[] Dy = new int[n];
        int[] Lx = new int[n];
        int[] Ly = new int[n];
        for (int i=0;i<n;i++){
            if (U[i]=='U'){
                Ux[u]=x[i];
                Uy[u]=y[i];
                u++;
            }else if (U[i]=='R'){
                Rx[r]=x[i];
                Ry[r]=y[i];
                r++;
            }else if (U[i]=='D'){
                Dx[d]=x[i];
                Dy[d]=y[i];
                d++;
            }else{
                Lx[l]=x[i];
                Ly[l]=y[i];
                l++;
            }
        }
        for (int i=0;i<u;i++){
            for (int j=0;j<r;j++){
                if (Ux[i]-Rx[j]==Ry[j]-Uy[i]&&Ux[i]-Rx[j]>0){
                    bool=true;
                    ans=Math.min(Ux[i]-Rx[j],ans);
                }
            }
            for (int j=0;j<d;j++){
                if (Ux[i]==Dx[j]&&Dy[j]>Uy[i]&&(Dy[j]-Uy[i])%2==0){
                    bool=true;
                    ans=Math.min((Dy[j]-Uy[i])/2,ans);
                }
            }
            for (int j=0;j<l;j++){
                if (Lx[j]-Ux[i]==Ly[j]-Uy[i]&&Lx[j]-Ux[i]>0){
                    bool=true;
                    ans=Math.min(Lx[j]-Ux[i],ans);
                }
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<d;j++){
                if (Dx[j]-Rx[i]==Dy[j]-Ry[i]&&Dy[j]-Ry[i]>0){
                    bool=true;
                    ans=Math.min(Dx[j]-Rx[i],ans);
                }
            }
            for (int j=0;j<l;j++){
                if (Ry[i]==Ly[j]&&Rx[i]<Lx[j]&&(Ly[j]-Ry[i])%2==0){
                    bool=true;
                    ans=Math.min(Lx[j]-Rx[i],ans);
                }
            }
        }
        for (int i=0;i<d;i++){
            for (int j=0;j<l;j++){
                if (Lx[j]-Dx[i]==Dy[i]-Ly[j]&&Dy[i]-Ry[j]>0){
                    bool=true;
                    ans=Math.min(Lx[j]-Dx[i],ans);
                }
            }
        }
        if (bool)System.out.println(ans*10);
        else System.out.println("SAFE");

    }
}
