import java.util.*;
public class Main{
    static int[][] dp;
    public static int compute(char[][] sb,int h,int w,int r,int c,int count){
        if(r==h-1 && c==w-1){
            if(sb[r][c]=='#')
                count++;
            return count;
        }
        if(r>=h || c>=w)  return Integer.MAX_VALUE;
        if(sb[r][c]=='#')
            count++;
        if(dp[r][c]!=-1)
            return dp[r][c];
        int c1=compute(sb, h, w, r+1, c, count);
        int c2=compute(sb, h, w, r, c+1, count);
        dp[r][c]=(c1<c2)?c1:c2;
        return dp[r][c];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        sc.nextLine();
        dp=new int[h][w];
        for(int[] temp:dp)
            Arrays.fill(temp, -1);
        char[][] arr=new char[h][w];
        for(int i=0;i<h;i++){
            arr[i]=sc.nextLine().toCharArray();
        }
        System.out.println(compute(arr,h,w,0,0,0));
    }
}