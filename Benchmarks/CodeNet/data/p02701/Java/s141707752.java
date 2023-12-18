import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] S=new String[N];
        int cnt=0;
        for(int i=0;i<N;i++){
            ++cnt;
            S[i]=sc.next();
            for(int j=0;j<i;j++)
                if(S[i].equals(S[j])){
                    --cnt;
                    break;
                }
        }
        System.out.println(cnt);
    }
}
