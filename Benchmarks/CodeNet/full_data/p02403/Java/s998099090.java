import java.util.Scanner;


public class Main{
    public static void main(String srgs[]){
        Scanner sc = new Scanner(System.in);
        
        int i,j;
        while(true){
            int a = sc.nextInt();
        int b = sc.nextInt();
            if(a==0 && b==0){
                break;
            }
        for(i = 0;i<a;i++){
            for(j=0;j<b;j++){
            System.out.printf("#");
            }
            System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
