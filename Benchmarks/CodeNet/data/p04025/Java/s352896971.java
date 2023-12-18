import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        int x = 0;
        for (int i = 0; i < a; i++) {
            b[i]=in.nextInt();
        }
        Arrays.sort(b);
        int sum = 0;
        long min = 1000000000;
        for (int i = b[0]; i < b[a-1]; i++) {
            for (int j = 0; j < a; j++) {
                if(i!=b[j]){
                    sum+=((b[j]-i)*(b[j]-i));
                    
                }
            }
            if(sum<min){
                min=sum;
            }
            sum=0;
        }
        System.out.println(min);
    }
}