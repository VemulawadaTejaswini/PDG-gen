import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.println(a);
        
        //int b = sc.nextInt();
        long temp = 0;
        for(long i=1; i <= a ; i++) {
            if( !(i%3 == 0 && i%5 == 0 && i%15 == 0)){
                
                temp = temp + i;
                System.out.println(temp);
            }
        }
        //System.out.println(String.format("%d",(int)temp));
        System.out.println(temp);
        /*
        if ((a * b) % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        */
    }
}