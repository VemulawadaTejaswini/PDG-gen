import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] h = new int[N];
        int ch=-1;
        for(int i=0; i<N; i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
            if(ch<0 && h[i]>0){
                ch = i;
            }
        }
        int resX, resY, resH;
        

        for(int i=0; i<=100; i++){
            for(int j=0; j<=100; j++){
                boolean a=true;
                int Cx = i;
                int Cy = j;
                int H = h[ch] + Math.abs(x[ch]-Cx) + Math.abs(y[ch]-Cy);
                for(int k=0; k<N; k++){
                    int karih = Math.max(H - Math.abs(x[k]-Cx) - Math.abs(y[k]-Cy),0);
                    if(karih!=h[k]){
                        a = false;
                        break;
                    }
                }

                if(a){
                    System.out.println(Cx + " " + Cy + " " + H);
                    return;
                }
            }
        }
        
        
        }
    }