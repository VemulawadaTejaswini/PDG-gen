import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String[] AnString = (scn.nextLine()).split(" ");
        int[] Aresult = new int[N];
        int A = 0;
        for(int i=1;i<N;i++){
            A = Integer.valueof(AnString[i]);
            Aresult[A]++;
        }
        for(int i=0;i<N;i++)
            System.out.println(Aresult[i]);
    }
}