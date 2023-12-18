import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;
        String result="";
        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        String[] array = new String[y];
        String in = "";
        for(int i=0;i<y;i++){
           in=inpunt.nextLine();
           array[i]=in;
        }

        Arrays.sort(array);

        for(int i=0;i<y;i++){
            System.out.print(array[i]);
        }

    }
}