import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc =new Scanner(System.in);
        int index= Integer.parseInt(sc.nextLine());
        String[] str = sc.nextLine().split(" ");
        for(int loo=str.length;loo>0;loo--){
            if(loo!=1)System.out.print(str[loo-1]+" ");
            else System.out.print(str[loo-1]);
        
    }
    System.out.println();

}}
