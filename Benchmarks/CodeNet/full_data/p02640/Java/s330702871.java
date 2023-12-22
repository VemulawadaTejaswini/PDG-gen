import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for(int loop=0; loop<=x; loop+){
            if( loop*2 + (x-loop)*4 == y ){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}