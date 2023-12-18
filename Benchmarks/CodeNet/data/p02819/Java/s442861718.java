import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int X = stdIn.nextInt();
        int Y=0;
        int flg=1;
        int i =X+1;
        do{
            flg=1;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    flg = 0;
                }
            }
            Y = i;
            i++;


        }while (flg == 0);

        System.out.print(Y);

    }
}