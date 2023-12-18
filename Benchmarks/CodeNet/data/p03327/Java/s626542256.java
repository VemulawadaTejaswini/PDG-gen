import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 10){
            System.out.println("ABC00" + N);
        }else if(N < 100){
            System.out.println("ABC0"  + N);
        }else if(N < 1000){
            System.out.println("ABC"   + N);
        }else if(N < 1009){
            System.out.println("ABD00" + (N - 999) );
        }else if(N < 1099){
            System.out.println("ABD0"  + (N - 999) );
        }else{
            System.out.println("ABD"   + (N - 999) );
        }
    }
}