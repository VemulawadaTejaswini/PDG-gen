import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
  
        int[] a = new int[3];
        if(sc.hasNext()){
            for(int i=0;i<3;i++){
                a[i] = sc.nextInt();
            }
            int n = sc.nextInt();

            while(a[0]>=a[1]){
                a[1] *= 2;
                n--;
            }

            while(a[1]>=a[2]){
                a[2] *= 2;
                n--;
            }

            if(n>=0) System.out.println("Yes");
            else System.out.println("No");
        }

        sc.close();
    }
}