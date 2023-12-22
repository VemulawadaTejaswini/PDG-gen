


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
               float d=scan.nextInt();
               float t=scan.nextInt();
               float s=scan.nextInt();
               if((d/s)<=t){
                   System.out.print("Yes");
               }else{
                   System.out.print("No");
               }
    }
}
