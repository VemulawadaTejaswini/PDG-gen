import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x=sc.nextInt();
        int asa[] = new int[x];
        long sum = 0;
        for(int i=0;i<x;i++){
            asa[i]=sc.nextInt();
            sum +=asa[i];
        }
        Arrays.sort(asa);
        
        System.out.println(asa[0]+" "+asa[x-1]+" "+sum);
    }
}
