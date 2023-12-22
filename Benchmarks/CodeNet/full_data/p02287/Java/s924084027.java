import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        long A[] = new long[H+1];
        for(int i = 1 ; i <= H ; i++)
            A[i] = sc.nextLong();
        for(int i = 1 ; i <= H ; i++){
            System.out.print("node " + i + ": key = " + A[i]+ ", ");
            if(i / 2 >= 1)
                System.out.print("parent key = " + A[i/2] + ", ");
            if(2 * i <= H)
                System.out.print("left key = " + A[2 * i] + ", ");
            if(2 * i + 1 <= H)
                System.out.print("right key = " + A[2 * i + 1] + ", ");
            System.out.println();
        }
    }
}
