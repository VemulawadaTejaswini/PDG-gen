import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();

        int[] ans=new int[N];
        for(int i=0;i<N;i++) {
            ans[i]=i;
        }


        for(int i=0;i<M;i++){

            int x=sc.nextInt()-1;
            int y=sc.nextInt()-1;
            int z=sc.nextInt();
            int a=ans[y];
            for(int j=0;j<N;j++){
                if(ans[j]==a){
                    ans[j]=ans[x];
                }
            }

        }
        int result=0;
        for(int i=0;i<N;i++){
            if(ans[i]==i){
                result++;

            }
        }




        System.out.print(result);

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
