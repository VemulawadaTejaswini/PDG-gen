
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int[] price=new int[n];
        int[] rs=new int[n];
        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            price[i]=x;
            rs[i]=Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                rs[i]=rs[i]<x-price[j]?x-price[j]:rs[i];
            }
        }
        int max=rs[0];
        for(int i=1;i<n;i++){
            max=Math.max(rs[i],max);
        }
        System.out.println(max);
    }

}

