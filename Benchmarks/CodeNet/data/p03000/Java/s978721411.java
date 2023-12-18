import java.util.Scanner;

public class Main{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        Integer X = Integer.parseInt(scan.next());

        Integer L[] = new Integer[N];

        for(int i=0;i<N;i++)
            L[i] = Integer.parseInt(scan.next());

        int counter = 0;
        int sum = 0;
        for(int i=0;i<N;i++){
            if((sum += L[i]) > X)
                break;
            counter++;
        }

        System.out.println(counter+1);
    }
}