import java.util.Arrays;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;


        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        String[] array = new String[y];
        for(int i=0;i<y;i++){
           array[i]=inpunt.nextLine();
        }

        Arrays.sort(array);

        for(int i=0;i<y;i++){
            System.out.print(array[i]);
        }





    }
}