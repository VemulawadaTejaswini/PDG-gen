import java.io.*;
import java.util.*;
class Program{
    int solve(int i, int size){
        int temp = i;
        for(int j=1;j<size;j++){
            temp=temp*10+i;
        }
        return temp;
    }
}
class Main{
    public static void main(String[] args) {
        Program obj = new Program();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt();
        int X[] = new int[n]; int Y[] = new int[m];
        for(int i=0;i<n;i++) X[i] = in.nextInt();
        for(int i=0;i<m;i++) Y[i] = in.nextInt();
        Arrays.sort(X); Arrays.sort(Y);
        //System.out.println(Arrays.toString(X)+" "+Arrays.toString(Y));
        if(x<y){
            if (X[n-1]<Y[0]) {
                if (x<Y[0]){
                    if(Y[0]-x>=1) System.out.println("No War");
                    else System.out.println("War");
                }
                else System.out.println("War");
            }
            else System.out.println("War");

        }
        else System.out.println("War");
    }
}