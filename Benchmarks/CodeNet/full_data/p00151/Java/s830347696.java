import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0)
                break;
            int[][] l = new int[n][n];
            int f=0;
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                for (int j = 0; j < n; j++) {
                    l[i][j] = s.charAt(j) - '0';
                    if(l[i][j]==1)f=1;
                }
            }
            int max=0;
            for (int i = 0; i < n; i++) {
                int sum1=f;
                int sum2=f;
                for (int j = 1; j < n; j++) {
                    if(l[i][j-1]+l[i][j]==2) {
                        sum1++;
                    }else if(l[i][j]==1){
                       max=Math.max(max, sum1); 
                       sum1=0;
                    }
                    if(l[j-1][i]+l[j][i]==2) {
                        sum2++;
                    }else if(l[j][i]==1){
                       max=Math.max(max, sum2); 
                       sum2=0;
                    }
                }
                max=Math.max(max, sum1); 
                max=Math.max(max, sum2); 
            }
            for(int i=0,x=1,y1=n,y2=-1;i<n*2-3;i++) {
                int sum3=f;
                int sum4=f;
                if(x<y1) {
                    y1--;
                    y2++;
                }else {
                    x++;
                }
                for(int j=x,k=y1;j<n&&k<n;j++,k++) {
                    if(l[k-1][j-1]+l[k][j]==2) {
                        sum3++;
                    }else if(l[k][j]==1){
                       max=Math.max(max, sum3); 
                       sum3=0;
                    }
                }
                for(int j=x,k=y2;j<n&&k>=0;j++,k--) {
                    if(l[k+1][j-1]+l[k][j]==2) {
                        sum4++;
                    }else if(l[k][j]==1){
                       max=Math.max(max, sum4); 
                       sum4=0;
                    }
                }
                max=Math.max(max, sum3); 
                max=Math.max(max, sum4); 
            }
            System.out.println(max);
        }
    }
}
