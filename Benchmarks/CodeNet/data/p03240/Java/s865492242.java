import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        for(int i=0;i<N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for(int cx=0;cx<=100;cx++){
            for(int cy=0;cy<=100;cy++){
                int start = 0;
                while(h[start]==0) start++;
                int H = h[start]+Math.abs(x[start]-cx)+Math.abs(y[start]-cy);
                boolean flag = true;
                for(int j=start+1;j<N;j++){
                    if(h[j]==0) continue;
                    int curH = h[j]+Math.abs(x[j]-cx)+Math.abs(y[j]-cy);
                    flag = flag&(curH==H);
                }
                if(flag==true){
                    System.out.println(Integer.toString(cx)+" "+Integer.toString(cy)+" "+Integer.toString(H));
                }
            }
        }
    }
}
