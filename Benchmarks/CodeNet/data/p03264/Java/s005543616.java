import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int k =scn.nextInt();
        int even = k/2;
        int odd = k-even;
        System.out.println(even+":"+odd);
    }
}