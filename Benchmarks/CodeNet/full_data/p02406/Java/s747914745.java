import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i=1;i<=x;i++){
            int j = i;
            int a = j%10;
            j/=10;
            int b = j%10;
            j/=10;
            int c = j%10;
            j/=10;
            int d = j%10;
            j/=10;
            int e = j%10;

            if(i%3==0){
                System.out.print(" " + i);
                continue;
            }
            if(a==3 || b==3 || c==3 || d==3 || e==3){
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
