import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scan= new Scanner(System.in);
       int n=scan.nextInt();
       int min,max;
       long sum=0;
       int start=scan.nextInt();
       min=start;
       max=start;
       sum+=start;
       for(int i=1;i<n;i++){
           int a=scan.nextInt();
           sum+=a;
           if(min>a){
               min=a;
           }
           if(max<a){
               max=a;
           }
       }
        System.out.println(min+" "+max+" "+sum);
    }
}

