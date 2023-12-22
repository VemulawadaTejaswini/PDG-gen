import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] x;
        x = new int[10000];
        int i=0;

        while(true){
            x[i] = sc.nextInt();

            if (x[i] == 0)
                break;

            i++;
        }

        i=0;
        while(true){
            System.out.println("Case " + i + ": " + x[i++]);
            if(x[i] == 0)
                break;
        }

    }
}

