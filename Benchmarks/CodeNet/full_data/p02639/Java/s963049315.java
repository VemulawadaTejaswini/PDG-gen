import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ary = new int[5];
        for(int i=0; i<5; i++){
            ary[i] = Integer.parseInt(sc.next());
        }

        for(int i=0; i<5; i++){
            if(ary[i] == 0){
                System.out.println((i+1));
            }
        }
    }
}