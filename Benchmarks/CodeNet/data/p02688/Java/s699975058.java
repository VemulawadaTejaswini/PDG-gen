import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,Integer> h=new HashMap<>();
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=n;i++){
            h.put(i,0);
        }

        for(int i=0;i<k;i++){
            int d=sc.nextInt();
            for(int j=0;j<d;j++){
                int c=sc.nextInt();
                h.put(c,1);
            }
        }

        for(int i=1;i<=n;i++){
            if(h.get(i)==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
