import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int N = sc.nextInt();
            if(N==0)break;
            int[] a = new int[N+1];
            for (int i = 0; i < N; i++) {
                a[i+1]=sc.nextInt();
            }
            double min = 1<<29;
            double e = 1e-10;
            int x=0,y=0,z=0;
            for (int i = 0; i <= 15; i++) {
                for (int j = 0; j <= 15; j++) {
                    for (int k = 0; k <= 15 ; k++) {
                        double H = calc(a,i,j,k);
                        if(min > H+e){
                            min = H;
                            x=i;
                            y=j;
                            z=k;
                        }
                    }
                }
            }
            System.out.println(x+" "+y+" "+z);
        }
    }
    static int m = 256;
    static double calc(int[] I,int s,int a,int c){
        double res = 0.0;
        int[] o = new int[257];
        int[] r = new int[I.length];
        r[0]=s;
        for (int j = 1; j < r.length; j++) {
            r[j] = (a*r[j-1]+c)%m;
        }
        for (int j = 1; j < I.length; j++) {
            o[(I[j]+r[j])%m]++;
        }
        for (int j = 0; j < o.length; j++) {
            if(o[j]!=0){
                double d = (double)o[j]/(I.length-1)*Math.log((double)o[j]/(I.length-1));
                res -= d;
            }
        }
        return res;
    }
}