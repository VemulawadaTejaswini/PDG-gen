import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] x2 = new int[n];
        int[] y2 = new int[m];
        int cnt = 0;
        int cnt2 = 0;
        int a  = 0;


        for(int i = 0;i<n;i++){
            x2[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            y2[i] = sc.nextInt();
        }

        for(int i =x+1;i<=y;i++){
            
            for(int j =0;j<n;j++){
                if(x2[j]<i){
                    cnt++;
                }
            }
            for(int k =0;k<m;k++){
                if(y2[k]>=i){
                    cnt2++;
                }
            }

            if(cnt==n && cnt2==m){
                a = i;
                break;
            }
            cnt =0;
            cnt2=0;
        }

        //System.out.println(cnt);
      //  System.out.println(cnt2);

        if(cnt==n && cnt2==m){
            System.out.println("No War");
        }else{
            System.out.println("War");
        }
        //System.out.println(a);

    }
}
