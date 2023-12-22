import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        while(true){
        int n;
        int max=0,min=1000,sum=0;
        n=sc.nextInt();
        if(n==0){
            break;
        }
        int a;

        for(int i=0;i<n;i++){
            a=sc.nextInt();
            if(max<a){
                max=a;
            }else if(a<min){
                min=a;
            }
            sum=sum+a;
        }
        sum=sum-max-min;
        int ave =sum/(n-2);

        System.out.println(ave);


    }
}
}
