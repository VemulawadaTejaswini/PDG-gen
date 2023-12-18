import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        Integer p[] = new Integer[N];
        
        for(int i=0;i<N;i++)   
            p[i] = Integer.parseInt(scan.next());

        int tmp = p[0];
        for(int i=1;i<N;i++){
            tmp = tmp ^ p[i];
        }
    
        if(tmp == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

}