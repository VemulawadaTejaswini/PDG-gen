import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int sum=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                for(int k=1;k<=a;k++){
                    int g=gcd(i,j);
                    int g2=gcd(g,k);
                    sum+=g2;
                }
            }
        }
      System.out.println(sum);
    }
    public static int gcd(int a,int b){
        if(a<b){
            int tmp=a;
            a=b;
            b=tmp;
        }
        int r=a%b;
        while(r!=0){
            a = b;
            b = r;
          	r = a % b;
        }
        return b;
    }
}