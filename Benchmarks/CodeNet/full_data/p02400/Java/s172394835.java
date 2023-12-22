import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.141592653589;
        double r = sc.nextDouble();
        System.out.println(String.format("%.6f",r*r*pi)+" "+String.format("%.6f",2*r*pi));
    }
}

