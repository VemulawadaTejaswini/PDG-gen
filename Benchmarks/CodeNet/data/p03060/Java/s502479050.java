import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] v;
        int[] c;

        v = new int[49];
        c = new int[49];
        for(int i=0;i<=N-1;i++){
            v[i] = sc.nextInt();
        }
        for(int j=0;j<=N-1;j++){
            c[j] = sc.nextInt();
        }
        if(N !=1){
            int x = v[0]+v[N];
            int y = c[0]+c[N];
            
            int xy = x-y;

            System.out.println(xy);

        }else if(N==1){
            int xy = v[0]-c[0];
            if(xy>0){
                System.out.println(xy);
            }else{
                System.out.println(0);
            }
        
        }else{
            System.out.println(0);
        }
    }
}