import java.util.Scanner;

class Main{
    public static void main(String[] a){

 Scanner a =  new Scanner(System.in);
      int x,i = 0;
        do{
             i++;
             x = a.nextInt();
             System.out.println("Case " + i + ": " + x);
        }while(x%10!=0);

    }
}