import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt();
        boolean f[]=new boolean[8];
        int p=0,c=0;
        Arrays.fill(f, true);
        for(int i=0;i<N;i++){
            int a=sc.nextInt()/400;
            if(a>6){
                f[7]=false;
                p++;
            }
            else if(f[a]){
                c++;
                f[a]=false;
            }
        }
        System.out.println(f[7]?c+" "+(c+p):c+1+" "+(c+p));
    }
}