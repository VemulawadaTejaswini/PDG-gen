import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int cnt=0;


        for(int i = 0;i<n;i++){
            num[i]=sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            if(num[i]%2==0 && (num[i]%3)!=0 && (num[i]%5) !=0){
                cnt++;
            }
        }

        if(cnt==0){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }

    }
}
