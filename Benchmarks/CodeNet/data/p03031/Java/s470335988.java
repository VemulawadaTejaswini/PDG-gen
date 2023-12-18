import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] table = new int[M][N];
        int[] onoff = new int[M];
        for(int i=0;i<M;i++){
            int k=sc.nextInt();
            for(int j=0;j<k;j++){
                int num = sc.nextInt();
                table[i][num-1] = 1;
            }
        }
        for(int i=0;i<M;i++){
            onoff[i]=sc.nextInt();
        }

        final int dec = (int)Math.pow(2.0, N);
        int count_full_light = 0;
        for(int i=0;i<dec;i++){
            String[] tmp = Integer.toBinaryString(i).split("");
            String[] sw = new String[N];
            for(int j=0;j<N;j++){
                if(j<N-tmp.length){
                    sw[j]="0";
                }
                else{
                    sw[j]=tmp[j-(N-tmp.length)];
                }
            }
            boolean light = true;
            for(int k=0;k<M;k++){
                int count = 0;
                for(int j=0;j<N;j++){
                    if(table[k][j]==1){
                        if(sw[j].equals("1"))count++;
                    }
                }
                if((count%2!=onoff[k])){
                    light=false;
                    break;
                }
            }
            if(light)count_full_light++;
        }

        System.out.println(count_full_light);
    }
    public static void dump(int[][] a ) {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}