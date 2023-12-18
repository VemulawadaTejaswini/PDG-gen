import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H+1][W+1];
        for(int i=1;i<=H;i++){
            for(int j=1;j<=W;j++) a[i][j]=sc.nextInt();
        }
        int[][] backup = new int[H+1][W+1];
        for(int i=1;i<=H;i++){
            System.arraycopy(a[i],0,backup[i],0,W+1);
        }
        int cnt = 0;
        ArrayList<String> ans = new ArrayList<>();
        System.out.println(cnt);
        for(int col=1;col<=W;col++){
            for(int row=1;row<=H-1;row++){
                if(a[row][col]%2==1){
                    a[row][col]--;
                    a[row+1][col]++;
                    ans.add(Integer.toString(row)+" "+Integer.toString(col)+" "+Integer.toString(row+1)+" "+Integer.toString(col)+" ");
                }
            }
            if(col<=W-1&&a[H][col]%2==1){
                a[H][col]--;
                a[H][col+1]++;
                ans.add(Integer.toString(H)+" "+Integer.toString(col)+" "+Integer.toString(H)+" "+Integer.toString(col+1)+" ");
            }
        }
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}

