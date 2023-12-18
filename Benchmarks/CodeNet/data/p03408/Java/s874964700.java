import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i =0;i<n;i++){
            s[i] = sc.next();
        }
        int m = sc.nextInt();
        String[] t = new String[m];
        int cnt=0;
        int max=0;


        for(int i =0;i<m;i++){
            t[i] = sc.next();
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(s[i].equals(s[j])){
                    cnt++;
                }
            }
            for(int j =0;j<m;j++){
                if(s[i].equals(t[j])){
                    cnt--;
                }
            }
            if(max<cnt){
                max=cnt;
            }
            cnt=0;
        }
        System.out.println(max);
    }
}




