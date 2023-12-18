import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //System.out.println(a);
        
        //int b = sc.nextInt();
        long temp = 0;
        for(long i=1; i <= a ; i++) {
            if( i%3 == 0 || i%5 == 0 || i%15 == 0){
            }else{
                temp = temp + i;
                //System.out.println(i);
            }
        }
        //System.out.println(String.format("%d",(int)temp));
        System.out.println(temp);

    }
}