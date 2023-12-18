import java.util.*;

class Main{

    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());

        if((N & 1) == 1)
        N += 1;
        System.out.println(N/2);
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
