import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        if(x==1||x==n*2-1){
            System.out.println("No");
        }else if(n==2){
            System.out.println("Yes");
            System.out.println("1 2 3");
        }else{
            System.out.println("Yes");
            int a, b, c, d, e;
            if(x>2){
                a = x-1;  b = x; c = x+1; d = x-2;
            }else{
                a = x+1; b = x; c = x-1; d = x+2;
            }
            e = 1;
            for (int i = 1; i <= 2*n-1 ; i++) {
                if(i==n-1){
                    System.out.print(a);
                } else if(i==n){
                    System.out.print(b);
                } else if(i==n+1){
                    System.out.print(c);
                } else if(i==n+2){
                    System.out.print(d);
                } else if(x>2){
                    if(e<x-2){
                        System.out.print(e);
                    }else{
                        System.out.print(e+4);
                    }
                    e++;
                }else{
                    if(i<x-1){
                        System.out.print(e);
                    }else{
                        System.out.print((e+4));
                    }
                    e++;
                }
            }
            System.out.println();
        }
    }
}
