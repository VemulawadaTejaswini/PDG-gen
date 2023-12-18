import java.util.*;

class ss {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=0;
        if(scan.hasNext())
            n=scan.nextInt();
        double d;
        if(n%2==0){
            d=0.5;
            System.out.format("%.10f",d);
        }else{
            d=n/2 + 1;
            d=d/n;
            System.out.format("%.10f",d);
        }
    }
}
