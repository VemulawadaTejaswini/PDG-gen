import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int money=100;
        int year=0;
        while(money<X){
            money*=1.01;
            year++;
        }
        System.out.println(year);
    }
}