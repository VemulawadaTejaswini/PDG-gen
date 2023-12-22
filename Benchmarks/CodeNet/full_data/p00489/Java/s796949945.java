import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int score[] = new int[n];

        for(int i=0;i<n;i++)score[i]=0;

        for(int s=0;s<n*(n-1)/2;s++){
            int a=in.nextInt();
            int b=in.nextInt();
            a=a-1;
            b=b-1;
            int t=in.nextInt();
            int m=in.nextInt();
            if(t>m)score[a]+=3;
            else if(t<m)score[b]+=3;
            else if(t==m){
                score[a]++;
                score[b]++;
            }
        }

        int rnk[] = new int[n];

        for(int s=0;s<n;s++){
            int cnt=1;
            for(int i=0;i<n;i++){
                if(score[s]<score[i])cnt++;
            }
            rnk[s]=cnt;
        }
        for(int i=0;i<n;i++)System.out.println(rnk[i]);

	}

}
