import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[][]nums=new int[n][d];
        for(int i=0;i<n;i++)
        for(int j=0;j<d;j++)nums[i][j]=sc.nextInt();
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int ans=0;
                for(int k=0;k<d;k++){
                    ans+=(nums[i][k]-nums[j][k])*(nums[i][k]-nums[j][k]);
                }
                int pow=(int)Math.sqrt(ans);
                if(pow*pow==ans)count++;
            }
        }
        System.out.println(count);
    }
}
