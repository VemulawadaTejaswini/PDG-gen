import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int X = Integer.parseInt(SC.next());
        if(X == 1){
            System.out.println(0 + " " + -1);
            return;
        }
        int MAX = (int)Math.sqrt((double) X)+1;

        int A,temp;
        for(int i=1;i<MAX;i++){
            if(X % i == 0){
                A = i+1;
                temp = A*A*A*A*A;
                if(temp+1 == X){
                    System.out.println(A + " " + -1);
                    break;
                } else if(temp-1 == X){
                    System.out.println(A + " " + 1);
                    break;
                }
            }
        }
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
