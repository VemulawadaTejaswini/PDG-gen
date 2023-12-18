import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long A=sc.nextLong();
        long B=sc.nextLong();
        if(N*M<(A*2)+(B*2)){
            System.out.println("NO");
            return;
        }else{
            System.out.println("YES");
            String[][] p = new String[N][M];
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    p[i][j]=".";
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(A>0&&M-j-1>=1&&A>B&&p[i][j]=="."&&p[i][j+1]=="."){
                        p[i][j]="<";
                        j++;
                        p[i][j]=">";
                        A--;
                        continue;
                    }else if(B>0&&p[i][j]=="."&&M-i-1>=1){
                        p[i][j]="^";
                        i++;
                        p[i][j]="v";
                        i--;
                        B--;
                        continue;
                    }
                }
            }
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    System.out.print(p[i][j]);
                }
                System.out.println("");
            }
        }
    }
}