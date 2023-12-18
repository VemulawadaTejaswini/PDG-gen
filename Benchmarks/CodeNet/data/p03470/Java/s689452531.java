import java.util.Scanner;
public class at{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a;
        int [] b=new int[N];
        //i番目の数の入力を行う
        for(int i=0;i<=N-1;i++){
             a=sc.nextInt();
             b[i]=a;  
        }
        int l=0;
        for(int j=0;j<=N-1;j++){
            for(int k=j+1;k<=N-1;k++){
                if(b[j]>b[k]){
                    l=l+1;
                }

            }
        if(j==N-1&&k==N-1){
            System.out.println(l);
        }
        }

        


    }
}
