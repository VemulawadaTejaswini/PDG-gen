import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int S = Integer.parseInt(SC.next());
        int W = Integer.parseInt(SC.next());

        if(S <= W){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }

    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
