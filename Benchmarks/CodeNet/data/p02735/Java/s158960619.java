import java.util.Scanner;

public  class Main {
    public static int ans=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int m=sc.nextInt();
         int arr[][]=new int[n][m];
         sc.nextLine();
         for (int i=0;i<n;i++){
             String s=sc.nextLine();
             for(int j=0;j<m;j++){
                 if(s.charAt(j)=='.')
                     arr[i][j]=1;
                 else
                     arr[i][j]=0;
             }
         }
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
         helper(arr,0,0,n-1,m-1,1,0);
         System.out.println(ans);
    }

    private static void helper(int[][] arr, int sx, int sy, int ex, int ey, int old, int count) {

        if(sx>ex || sy>ey)
            return;


        if(sx==ex && sy==ey){
            //System.out.println(count);
            if(arr[sx][sy]==0) count++;
            ans=Math.min(ans,count);
            return;
        }


        if(arr[sx][sy]==0 && old==1)
            helper(arr, sx+1, sy, ex, ey, arr[sx][sy], count+1);
        else
            helper(arr, sx+1, sy, ex, ey, arr[sx][sy], count);

        if(arr[sx][sy]==0 && old==1)
            helper(arr, sx, sy+1, ex, ey, arr[sx][sy], count+1);
        else
            helper(arr, sx, sy+1, ex, ey, arr[sx][sy], count);

    }
}
