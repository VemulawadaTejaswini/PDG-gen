import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int x;
        int count=0;       
        while(true){
           n=sc.nextInt();
           x=sc.nextInt();
           if(n==0 && x==0){
              break;
           }
           for(int i=1;i<=n;i++){
               for(int j=0;j<=n;j++){
                   for(int k=0;k<=n;k++){
                     if(i+j+k==x){
                         if(i!=j && i!=k && j!=k){
                            count++;
                         }
                     }
                   }
                }
            }
           System.out.println(count);
        }
    }
}
