import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int hairu=sc.nextInt();
        int ans=0;
        for(int i=0;i<n;i++){
            hairu+=sc.nextInt();
            int deru=sc.nextInt();
            int S=hairu-deru;
            if(S<0){
                ans=0;
                break;
            }else if(S>ans){
                ans=S;
            }
            hairu=S;
        }
        System.out.println(ans);
    }
}