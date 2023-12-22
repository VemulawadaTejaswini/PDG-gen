import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int[] t= {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
       Arrays.sort(t);
       System.out.println(Math.max(sc.nextInt(),sc.nextInt())+t[1]+t[2]+t[3]);
    }
}
