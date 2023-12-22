import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i=0; i<5; i++)
            if(in.nextInt() == 0)
                System.out.println(i);
            
    }
}