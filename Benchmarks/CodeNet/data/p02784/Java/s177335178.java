import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    Scanner scan = new Scanner(System.in);

    int H;
    int N;
    ArrayList<Integer> A = new ArrayList<>();

    Main(){
        H = scan.nextInt();
        N = scan.nextInt();
        for(int i = 0; i < N; i++){
            A.add(scan.nextInt());
        }

        judge(H, A);

        /*
        for(int i = 0; i < N; i++){
            System.out.println(A.get(i));
        }*/
    }

    public void judge(int H, ArrayList<Integer> A){
        for(int i = 0; i < A.size(); i++){
            H -= A.get(i);
        }
        if(H <= 0){System.out.println("Yes");}
        else{System.out.println("No");}
    }

    public static void main(String[] args){
        new Main();
    }
}