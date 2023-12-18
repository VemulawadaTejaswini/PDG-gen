import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] S=new String[N];
        int cnt=0;
        int flag;
        for(int i=0;i<N;i++){
            flag=0;
            S[i]=sc.next();
            for(int j=0;j<i;j++)
                if(S[i].equals(S[j])){
                    flag=1;
                    break;
                }
            if(flag==0) cnt++;
        }
        System.out.println(cnt);
    }
}
