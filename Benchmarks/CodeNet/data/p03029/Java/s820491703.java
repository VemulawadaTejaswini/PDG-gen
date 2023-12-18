import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 2;
        int[] a = new int[2];
        for(int i = 0; i < number; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        int applepie = ApplePie(a);
        System.out.println(applepie);
    }
    private static int ApplePie(int a[]){
        int pie = a[0] * 3 + a[1];
        pie = pie / 2;
        return pie;
    }
}