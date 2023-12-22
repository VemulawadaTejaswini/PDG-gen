import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int goal[]=new int[n];
        for (int i=0;i<n;i++){
            goal[i]=0;
        }
        for (int i=1;i<=k;i++){
            int d=sc.nextInt();
            for(int j=0;j<d;j++){
                goal[sc.nextInt()-1]++;
            }
        }

int num=0;
        for (int i=0;i<n;i++){
            if(goal[i]==0){
                num++;
            }
        }

   System.out.println(num);











    }
}
