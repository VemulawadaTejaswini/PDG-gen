import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try(Scanner sc =new Scanner(System.in));
        while(true){
        int n;
        int max=0,min=1000,sum=0;
        n=sc.nextInt();
        int []a =new int [n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(max<a[i]){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];
            }
            sum=sum+a[i];
        }
        sum=sum-max-min;
        int ave =sum/(n-2);

        System.out.println(ave);


    }
}
}
