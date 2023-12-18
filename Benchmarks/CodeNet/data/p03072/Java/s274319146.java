import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tmpH;
        int ans=0;
        int maxH=0;
        for(int i=0;i<n;i++){
            tmpH=sc.nextInt();
            if(tmpH>=maxH){
                ans++;
            }
            if(tmpH>maxH){
                maxH=tmpH;
            }
        }
        System.out.println(ans);
    }

}