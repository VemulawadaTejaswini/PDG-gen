import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int i;
        int j=0;
      
        for(i=num2; i<=num3;i++){
            if(i%num1==0){
                System.out.println("OK");
                j=1;
                break;
                }
            }
        if(j==0)
              System.out.println("NG");
        scan.close();
    }
}

