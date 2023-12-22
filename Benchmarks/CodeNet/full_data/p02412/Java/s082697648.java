import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);

       for(;;){
           int n=scan.nextInt();
           int x=scan.nextInt();

           if(n==0 && x==0){
               break;
           }
           int i,j,k;
           int count=0;

           for(i=1;i<=n;i++){
               for(j=i+1;j<=n;j++){
                   for(k=j+1;k<=n;k++){

                       if(i+j+k==x){
                           count++;
                       }
                   }
               }
           }

           System.out.println(count);
       }
    }
}

