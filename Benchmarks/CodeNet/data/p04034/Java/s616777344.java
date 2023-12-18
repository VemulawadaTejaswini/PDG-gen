import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] box = new boolean[n];
        int[] ball = new int[n];
        box[0]=true;
        for (int i=0;i<m;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            box[y]=box[x]||box[y];
            ball[x]--;
            ball[y]++;
            if (ball[x]==-1)box[x]=false;
        }
        int ans=0;
        for (int i=0;i<n;i++)if (box[i])ans++;
        System.out.println(ans);
    }
}