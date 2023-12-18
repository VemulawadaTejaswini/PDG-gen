import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        int cnt = 0;

        for(int i = 0;i<n;i++){
            l[i] = sc.nextInt();
        }

        Arrays.sort(l);

        for(int i =0;i<n-1;i++){
            cnt+=l[i];
        }

        //System.out.println(cnt);
        //System.out.println(l[n-1]);

        if(cnt>l[n-1]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
