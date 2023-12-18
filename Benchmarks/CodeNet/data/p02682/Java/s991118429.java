import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        if(a>=k){
            System.out.println(a);
        }
        else if(a+b >=k){
            System.out.println(a);
        }
        else{
            System.out.println(a - (k - b -a));
        }
    }
}