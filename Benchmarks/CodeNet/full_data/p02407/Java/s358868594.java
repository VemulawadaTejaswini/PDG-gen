import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans[] = new int[1000];
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            ans[i]=sc.nextInt();
        }
        
        System.out.print(ans[(n-1)]);
        for(int i =0;i<n;i++){
            System.out.print(" "+ans[(n-2-i)]);
            
        }
        sc.close();
    }
}
