import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int T=in.nextInt();
        int count=0;
        int[] arr=new int[T];
        for(int i=0;i<T;i++){
            arr[i]=in.nextInt();
        }
        for(int i=1;i<=T;i++){
            if(arr[i]!=i)
                count++;
        }
        if(count==0 || count==2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
