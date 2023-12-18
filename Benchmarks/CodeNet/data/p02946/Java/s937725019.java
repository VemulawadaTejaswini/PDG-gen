
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k= in.nextInt();
        int x= in.nextInt();

        for(int i=k-1;i>0;i--){
            int c=x-i;
            System.out.print(" "+ c);
        }
        for(int i=0;i<k;i++){
            int c=x+i;
            System.out.print(" "+ c);
        }
        System.out.println();
    }
}
