import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x[] = new int[n];
        int i;

        for(i = 0;i < n;i++){
            x[i] = sc.nextInt();
        }

        for(i = n - 1;i >= 0;i--){
            if(i == 0){
                System.out.printf("%d\n",x[i]);
            }else{
                System.out.printf("%d ",x[i]);
            }
        }
    }
}
