import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      int i,j,N;
      double k;
      N=sc.nextInt();
      for(i=1;i<=N;i++){
          if(i%3==0){
            System.out.print(" "+i);
          }else{
              for(j=0; ;j++){
                k=i;
                if(k%10==3){
                    System.out.print(" "+i);
                } 
                if(k<1){
                    break;
                }
                k/=10;
              }
          }
      }
      System.out.println();     
    }
}
