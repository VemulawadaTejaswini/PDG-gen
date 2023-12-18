import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=in.nextInt();
            }
        }

        int ans = find(mat, 0, -1);
        System.out.println(ans);

    }

    static int find(int[][] mat ,int n, int prev){
    int max=0;
    if( n== mat.length ){
        for(int i=0;i<3;i++){
            if(i==prev) 
                continue;
            max=Math.max(max,mat[n][i]);
        }
        return max;
    }
    switch(prev){
        case 0:{
            max = Math.max(find(mat, n+1, 1),find(mat, n+1, 2));
            break;
        }
        case 1:{
            max = Math.max(find(mat, n+1, 0),find(mat, n+1, 2));
            break;
        }
        case 2:{
            max = Math.max(find(mat, n+1, 0),find(mat, n+1, 1));
            break;
        }
        default:{
            max = Math.max(Math.max(find(mat, n+1, 0),find(mat, n+1, 1)),find(mat, n+1, 2)) ;
        }
    }
    return max;
    }
}