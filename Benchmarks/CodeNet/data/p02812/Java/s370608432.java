import java.util.*;

class Main {

    public Main(){
        Scanner SC = new Scanner(System.in);

        int N = SC.nextInt();
        String S = SC.next();

        int C = 0, R = 0;
        for(int i=0;i<N;i++){
            if(S.charAt(i) == 'A'){
                C = 1;
            } else if (C == 1 && S.charAt(i) == 'B'){
                C = 2;
            } else if (C == 2 && S.charAt(i) == 'C'){
                C = 0;
                R++;
            } else {
                C = 0;
            }
        }

        System.out.println(R);
    }
    public static void main(String[] args){
        Main m = new Main();
    }
}
