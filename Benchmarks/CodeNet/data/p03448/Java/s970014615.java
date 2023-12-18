import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();

        int ans=0;

        for(int i=0;i<a+1;i++){
            for(int j=0;j<b+1;j++){
                for(int k=0;k<c+1;k++){
                    if(500*i+100*j+50*k==x){
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);    // output
    }
}