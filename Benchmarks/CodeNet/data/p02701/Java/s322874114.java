import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList t = new ArrayList();
        for(int i=0;i<N;i++){
            String s = sc.next();
            if(!(t.contains(s))){
                t.add(s);
            }
        }
        
        System.out.println(t.size());

        }


    }
