import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long ans=0;
        int prev=s.nextInt();
        for(int i=1;i<n;i++){
            int ele=s.nextInt();
            if(ele<prev){
                ans+=prev-ele;
            }
            else{
                prev=ele;
            }
        }

        System.out.print(ans);
    }
}