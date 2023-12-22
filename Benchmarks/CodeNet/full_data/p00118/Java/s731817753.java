import java.util.Scanner;
public class Main{
    static char [][] f;
    static int H,W;
    static int count = 0;
    static boolean [][] k;
    
    static void kukaku(int i,int j) {
        if(!k[i][j]) {
            k[i][j]=true;
            if(j+1<W && f[i][j+1]==f[i][j]) {
                kukaku(i,j+1);
            }
            if(i+1<H && f[i+1][j]==f[i][j]) {
                kukaku(i+1,j);
            }
            if(j-1>=0 && f[i][j-1]==f[i][j]) {
                kukaku(i,j-1);
            }
            if(i-1>=0 && f[i-1][j]==f[i][j]) {
                kukaku(i-1,j);
            }
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(true) {
                H = Integer.parseInt(sc.next());
                W = Integer.parseInt(sc.next());
                if(H==0 && W==0) break;
                f = new char[H][W];
                k = new boolean[H][W];
                for(int i=0;i<H;i++) {
                    f[i] = sc.next().toCharArray();
                }
                for(int i=0;i<H;i++) {
                    for(int j=0;j<W;j++) {
                        if(!k[i][j]) {
                        	kukaku(i,j);
                        	count++;
                        	//System.err.println(i+" "+j+" "+count);
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}
