
import java.util.Scanner;

public class Main {
    public static int[] A;
    public static long[][] xor;
    public static long[][] add;
    public static boolean[][] doneX;
    public static boolean[][] doneA;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
        }
        xor=new long[N][N];
        add=new long[N][N];
        doneX=new boolean[N][N];
        doneA=new boolean[N][N];
        long result=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(add(i,j)==xor(i,j)){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
    public static long add(int l,int r){
        if(doneA[l][r]) return add[l][r];
        doneA[l][r]=true;
        long result=0;
        for(int i=l;i<=r;i++){
            result+=A[i];
            add[l][i]=result;
            doneA[l][i]=true;
        }
        add[l][r]=result;
        return result;
    }
    public static long xor(int l,int r){
        if(doneX[l][r]) return xor[l][r];
        doneX[l][r]=true;
        long result=0;
        for(int i=l;i<=r;i++){
            result=result^A[i];
            xor[l][i]=result;
            doneX[l][i]=true;
        }
        xor[l][r]=result;
        return result;
    }

}