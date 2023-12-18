import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long q=scan.nextLong();//0.25L
        long h=scan.nextLong();//0.5L
        long s=scan.nextLong();//1L
        long d=scan.nextLong();//2L
        long n=scan.nextLong();
        long k=0;
        long q1l=q*4;
        long h1l=h*2;
        long s2l=s*2;
        while(n>=2){
            n-=2;
            if(s2l<d){
                k+=s2l;
            }else{
                k+=d;
            }
        }
        if(n==1){
            if(q1l<h1l&&q1l<s){
                k+=q1l;
            }else if (h1l<q1l&&h1l<s){
                k+=h1l;
            }else{
                k+=s;
            }
        }
        System.out.println(k);
    }
}