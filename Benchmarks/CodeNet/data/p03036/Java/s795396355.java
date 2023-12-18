import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int r = scn.nextInt();
        int D=scn.nextInt();
        int x2000=scn.nextInt();
        for(int i=1;i<=10;i++){
            int x = r*x2000-D;
            System.out.println(x);
            x2000 =  x;
        }
    }
}
