import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int d=sc.nextInt();
        int x[]=new int[11];
        x[0]=sc.nextInt();
        for(int i=0; i<10; i++){
            x[i+1]=r*x[i]-d;
            System.out.println(x[i+1]);
        }
    }
}
