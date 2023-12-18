import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Blue = sc.nextInt();
        int Red = sc.nextInt();
        int count = 0;
        
        int BR = Blue+Red;
        int wari = N/BR;
        if(wari>0){
            count += wari*Blue;
        }
        wari=0;
        int amari = N%BR;
        if(amari!=0 && amari>=Blue){
            count += Blue;
        }
        if(amari!=0 && amari<Blue){
            count += amari;
        }
        amari = 0;
        System.out.println(count);
    }
}