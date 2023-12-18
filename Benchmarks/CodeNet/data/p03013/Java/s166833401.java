import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next());
        int M = Integer.parseInt(scan.next());
        ArrayList<Integer> E = new ArrayList<Integer>();

        for(int i=0;i<M;i++)
            E.add(Integer.parseInt(scan.next()));

        System.out.println(getConbination(N, E)/1000000007);
    }

    static Integer getConbination(int N,ArrayList E){
        if(N == 1){
            if(E.indexOf(1) == -1)
                return 1;
            else
                return 0;
        }else if(N == 2){
            if(E.indexOf(1) == -1)
                return 2;
            else
                return 1;
        }

        if(E.indexOf(N-1) != -1 && E.indexOf(N-2) != -1){
            return 0;
        }else if(E.indexOf(N-1) != -1){
            return getConbination(N-2, E);
        }else if(E.indexOf(N-2) != -1){
            return getConbination(N-1, E);
        }else{
            return getConbination(N-1, E) + getConbination(N-2, E);
        }
    }
}