import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s[] = new String[N];
        ArrayList t = new ArrayList();
        for(int i=0;i<N;i++){
            s[i]=sc.next();
        }
        for(int i=0;i<N;i++){
            if(!(t.contains(s[i]))){
                t.add(s[i]);
            }
        }
        System.out.println(t.size());

        }


    }