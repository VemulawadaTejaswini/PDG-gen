import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] c = new int[13];
        int[] d = new int[11];
        int minc = Integer.MAX_VALUE;
        int mind = Integer.MAX_VALUE;
        for(int i = 0; i <= 12; i++){
            if(a % 2 == 0){
                c[i] = (int) (a * 12.5 + i);
            }else{
                c[i] = (int) (a * 12.5 + i) + 1;
            }
            if(c[i] < minc){
                minc = c[i];
            }
            System.out.print(c[i] + " ");
        }
        for(int i = 0; i <= 9; i++){
            if(b % 10 == 0){
                d[i] = (int) (b * 10 + i);
            }else{
                d[i] = (int) (b * 10 + i) + 1;
            }
            if(d[i] < mind){
                mind = d[i];
            }
            System.out.print(d[i] + " ");
        }
        if(Math.abs((int) (a * 12.5) - (int) (b * 10)) > 10){
            System.out.println(-1);
        }else if(minc <= mind){
            System.out.println(mind);
        }else{
            System.out.println(minc);
        }
    }
}