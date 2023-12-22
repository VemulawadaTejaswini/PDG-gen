import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int i=0;
            int n = sc.nextInt();
            int r = sc.nextInt();
            int[] card = new int[n];
            if(n==0 && r==0) break;
            for(i=0;i<n;i++){
                card[i]=i+1;
            }
            for(i=0;i<r;i++){
                int p = sc.nextInt();
                int c = sc.nextInt();
                for(int j=0;j<(p+c-1)/2;j++){
                    int alt1=card[(n-1)-j];
                    card[(n-1)-j]=card[(n-(p+c-1))+j];
                    card[(n-(p+c-1))+j]=alt1;
                }
                for(int k=0;k<c/2;k++){
                    int alt2=card[(n-1)-k];
                    card[(n-1)-k]=card[(n-c)+k];
                    card[(n-c)+k]=alt2;
                }
                for(int l=0;l<(p-1)/2;l++){
                    int alt3=card[(n-c-1)-l];
                    card[(n-c-1)-l]=card[(n-(p+c-1))+l];
                    card[(n-(p+c-1))+l]=alt3;
                }
            }
             System.out.println(card[n-1]);
        }
    }
}
