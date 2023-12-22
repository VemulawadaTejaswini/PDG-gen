import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] sum = new int[n];
            int[] team = new int[n];
            for (int i = 0; i < n; i++) {
                team[i]=sc.nextInt();
                for(int j=0;j<4;j++) {
                    sum[i]+=sc.nextInt()*60+sc.nextInt();
                }
            }
            for(int i=0;i<n-1;i++) {
                for(int j=i+1;j<n;j++) {
                    if(sum[i]>sum[j]) {
                        int t=sum[i];
                        sum[i]=sum[j];
                        sum[j]=t;
                        t=team[i];
                        team[i]=team[j];
                        team[j]=t;
                    }
                }
            }
            System.out.println(team[0]+"\n"+team[1]+"\n"+team[n-2]);
        }
    }
}
