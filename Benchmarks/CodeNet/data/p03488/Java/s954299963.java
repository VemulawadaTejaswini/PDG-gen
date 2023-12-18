import java.util.*;
public class Main {
    static  String s;
    static int x,y;
    static int[] cx = new int[4000];
    static int[] cy = new int[4000];
    static int p=0,q=-1;
    //訪問したかどうかを表すフラグdpx,dpy
    static int[][] dpx = new int[8000][16002];
    static int[][] dpy = new int[8000][16002];


    public static boolean istruex(int sum, int i){
        if(dpx[i][sum+8000]==1) return true;
        if(i==p && (sum==cx[i]|| sum==-cx[i])) return true;
        else if(i==p) return false;
        if(istruex(sum-cx[i],i+1)==true || istruex(sum + cx[i], i + 1) == true){
            dpx[i][sum+8000]=1;
            return true;
        }else {
            return false;
        }
    }

    public static boolean istruey(int sum, int i){
        if(dpy[i][sum+8000]==1) return true;
        if(i==q && (sum==cy[i]|| sum==-cy[i])) return true;
        else if(i==q) return false;
        if(istruey(sum-cy[i],i+1)==true || istruey(sum + cy[i], i + 1) == true){
            dpy[i][sum+8000]=1;
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s =sc.next();
        x = sc.nextInt();
        y = sc.nextInt();

        int countT=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='T'){
                if(countT%2==0){
                    q++;
                } else p++;
                countT++;
            }else {
                if(countT%2==0){
                    cx[p]++;
                } else cy[q]++;
            }
        }
        if(istruex(x,0)==true && istruey(y,0)==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
