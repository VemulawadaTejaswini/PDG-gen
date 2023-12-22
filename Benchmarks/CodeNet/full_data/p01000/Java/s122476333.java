import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
 
class Main {
    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();
 
    int[][] d=new int[][]{
        {1,0,0},
        {-1,0,0},
        {0,1,0},
        {0,-1,0},
        {0,0,1},
        {0,0,-1},
 
        {1,1,0},
        {-1,1,0},
        {1,-1,0},
        {-1,-1,0},
 
        {1,0,1},
        {-1,0,1},
        {1,0,-1},
        {-1,0,-1},
 
        {0,1,1},
        {0,-1,1},
        {0,1,-1},
        {0,-1,-1},
 
        {1,1,1},
        {-1,1,1},
        {1,-1,1},
        {1,1,-1},
        {-1,-1,1},
        {1,-1,-1},
        {-1,1,-1},
        {-1,-1,-1},
    };
 
    public void run() {
        int[][][] box=new int[5][5][5];
 
        int[][][] tmp=new int[5][5][5];
 
        int T=0;
        while(true){
            int n=sc.nextInt();
            if(n==0)return;
            T++;
            if(T>=2){
                ln();
            }
            for(int z=0;z<5;z++)
                for(int y=0;y<5;y++){
                char[] l=sc.next().toCharArray();
                for(int x=0;x<5;x++){
                    box[z][y][x]=l[x]-'0';
                }
            }
            int M1S=sc.nextInt();
            int[] M1=nextIntArray(M1S);
            Arrays.sort(M1);
 
            int M2S=sc.nextInt();
            int[] M2=nextIntArray(M2S);
            Arrays.sort(M2);
            for(int c=0;c<n;c++){
                //copy
                for(int z=0;z<5;z++)for(int y=0;y<5;y++)for(int x=0;x<5;x++){
                    tmp[z][y][x]=box[z][y][x];
                }
 
                for(int z=0;z<5;z++)for(int y=0;y<5;y++)for(int x=0;x<5;x++){
                    if(box[z][y][x]==1){
                        int life=0;
                        for(int i=0;i<d.length;i++){
                            int px=x+d[i][0];
                            int py=y+d[i][1];
                            int pz=z+d[i][2];
                            if(0<=px && px<5 && 0<=py && py<5  && 0<=pz && pz<5){
                                if(box[pz][py][px]==1)life++;
                            }
                        }
                        if(Arrays.binarySearch(M2,life)<0){
                            tmp[z][y][x]=0;
                        }
                    }else{
                        int life=0;
                        for(int i=0;i<d.length;i++){
                            int px=x+d[i][0];
                            int py=y+d[i][1];
                            int pz=z+d[i][2];
                            if(0<=px && px<5 && 0<=py && py<5  && 0<=pz && pz<5){
                                if(box[pz][py][px]==1)life++;
                            }
                        }
                        if(Arrays.binarySearch(M1,life)>=0){
                            tmp[z][y][x]=1;
                        }
 
                    }
                }
 
                //copy
                for(int z=0;z<5;z++)for(int y=0;y<5;y++)for(int x=0;x<5;x++){
                    box[z][y][x]=tmp[z][y][x];
                }
            }
            ln("Case "+T+":");
            for(int z=0;z<5;z++){
                for(int y=0;y<5;y++){
                    for(int x=0;x<5;x++)
                        pr(box[z][y][x]);
                    ln();
                }
                if(z<4)ln();
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
 
    public int[] nextIntArray(int n){
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=sc.nextInt();
        }
        return res;
    }
    public static void pr(Object o) {
        out.print(o);
    }
    public static void ln(Object o) {
        out.println(o);
    }
    public static void ln() {
        out.println();
    }
}