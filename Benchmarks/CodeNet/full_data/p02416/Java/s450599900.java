import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,x,a,b,c,d,e,f,g;
        for(i=0;;i++){
            x=sc.nextInt();
            if(x==0){
                break;
            }
            a=x/1000;
            b=x%1000;
            c=b/100;
            d=b%100;
            e=d/10;
            f=d%10;
            g=a+c+e+f;
            System.out.println(g);
        }
    }
}
