import java.io.*;
import java.util.*;
class Program{

}
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip[];
        int i,no,N = in.nextInt(); int M = in.nextInt();
        boolean K[][]= new boolean[N][M];
        for(int n = 0;n<N;n++){
            no = in.nextInt();
            while(no-->0){
                K[n][in.nextInt()-1] = true;
            }
        }
        //for(boolean[] var: K) System.out.println(Arrays.toString(var));
        int count = 0,local=0;
        for(i =0;i<M;i++){
            local = 0;
            for(int j=0;j<N;j++){
                if (!K[j][i]){
                    break;
                }
                local++; 
            }
            if (local==N) count++;
        }
        System.out.println(count);
    }
}