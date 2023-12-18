import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = findK(n);
        if(k==-1){
            System.out.println("No");
            System.exit(0);
        }
        int[][] res = new int[k][k-1];
        for(int i=0;i<k-1;i++) res[0][i] = i+1;
        int[] index = new int[k];
        for(int i=0;i<k;i++) index[i]=i;
        for(int row=1;row<k;row++){
            int idx = 0;
            for(int j=0;j<row;j++) res[row][idx++] = res[j][index[j]++];
            if(row==k-1) continue;
            res[row][idx++]=res[row-1][k-2]+1;
            while(idx<k-1){
                res[row][idx] = res[row][idx-1]+1;
                idx++;
            }
        }
        System.out.println("Yes");
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(Integer.toString(k-1)+" ");
            for(int j=0;j<k-1;j++){
                System.out.print(Integer.toString(res[i][j])+" ");
            }
            System.out.println("");
        }
    }
    static int findK(int n){
        int k=1;
        while(k*(k-1)<=2*n){
            if(k*(k-1)==2*n) return k;
            k++;
        }
        return -1;
    }
}
