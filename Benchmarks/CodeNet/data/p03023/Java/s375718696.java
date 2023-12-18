import java.util.*;



public class Main{

    public static void main(String[] args){

        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        double exvalue=0;
       
        int ncr;
        for(int x=0;x<30;x++){

            ncr = (factorial(n) / (factorial(n - x) * factorial(n)));
            exvalue=exvalue+( (n+x)*ncr*Math.pow(c, x)*(Math.pow(a, n)+Math.pow(b, n)) )/(Math.pow(100, n+x));
        }
        int sol=(int) Math.round(exvalue);
        System.out.print(sol/(Math.pow(10,9)+7));
        
    }


public static int factorial(int n){
    //1
    int fact = 1;
    //2
    for (int i = 1; i <= n; i++) {
        //3
        fact = fact * i;
    }
    //4
    return fact;
}
}