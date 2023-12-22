import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i=0;
        n = sc.nextInt();
        int box[]=new int [n];
        
        for(i=0;i<n;i++){
        	box[i] = sc.nextInt();
        }
        sc.close();
        for(i=(n-1);i>=0;i--){
            System.out.print(box[i]);
            if(i != 0){
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
