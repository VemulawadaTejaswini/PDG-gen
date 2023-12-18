import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int total = 0;

        boolean[] sunuke = new boolean[n];
        for(int i=0; i<k; i++){
            int d = sc.nextInt();
            for(int j=0; j<d; j++){
                int a = sc.nextInt();
                sunuke[a-1] = true;
            }
        }
        for(boolean i : sunuke){
            if(!i){
                total++;
            }
        }
        System.out.println(total);
    } 
}