import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n=scan.nextInt();
        int m=scan.nextInt();
        boolean []jdg=new boolean[n];
        int []ball=new int [n];
        int ans=0;
        for(int i=0;i<n;i++){
            jdg[i]=false;
            ball[i]=1;
        }
        jdg[0]=true;

        int x,y;
        for(int i=0;i<m;i++){
            x=scan.nextInt()-1;
            y=scan.nextInt()-1;
            ball[x]--;
            ball[y]++;
            if(jdg[x])
                jdg[y]=true;
            if(ball[x]==0)
                jdg[x]=false;
        }
        for(int i=0;i<n;i++){
            if(jdg[i]) {
                ans++;

            }
        }
        System.out.println(ans);
    }
}