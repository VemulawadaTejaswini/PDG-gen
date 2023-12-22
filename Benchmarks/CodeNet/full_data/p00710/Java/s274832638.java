import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        while(true){
            int i,j;
            int n=sc.nextInt();
            int r=sc.nextInt();

            if(n==0 && r==0){
                break;
            }

            int[] num=new int[n];

            for(i=0;i<n;i++){
                num[i]=n-i;
            }

            int[] swap=new int[n];

            for(i=0;i<r;i++){
                int p=sc.nextInt();
                int c=sc.nextInt();

                for(j=0;j<p+c-1;j++){
                    if(j<p-1){
                        swap[j]=num[j];
                    }else{
                        num[j-p+1]=num[j];
                    }
                }
                for(j=0;j<p-1;j++){
                    num[c+j]=swap[j];
                }
            }
            System.out.println(num[0]);
        }
        sc.close();
    }
}
