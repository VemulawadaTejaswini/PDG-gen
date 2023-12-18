
import java.util.Scanner;

class Main{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int m=scanner.nextInt();
                int a=0;
                int b=0;
                int c=-1;
                int d=-2;
                if(m==1){
                        for(int i=0;i<2*m;i++){
                                scanner.nextInt();
                        }
                        System.out.println("IMPOSSIBLE");
                        return;
                }
                if(m==(n*(n-1)/2)){
                        for(int i=0;i<2*m;i++){
                                scanner.nextInt();
                        }
                        System.out.println("POSSIBLE");
                        return;
                }
                for(int i=0;i<m;i++){
                        a=scanner.nextInt();
                        b=scanner.nextInt();
                        if(a==1){
                                c=b;
                        }
                        if(b==n){
                                d=a;
                        }
                }
                if(c==d){
                        System.out.println("POSSIBLE");
                }else{
                        System.out.println("IMPOSSIBLE");
                }
        }
}