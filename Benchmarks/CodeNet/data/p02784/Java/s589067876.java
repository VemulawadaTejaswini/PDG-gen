import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       int y,n,i,x,sum=0;
       y= input.nextInt();
       n=input.nextInt();
       for(i=0;i<n;i++){
           x=input.nextInt();
           sum=sum+x;
       }
    if(sum>=y){
        System.out.print("yes");
    }
    else 
        System.out.print("no");
}
}