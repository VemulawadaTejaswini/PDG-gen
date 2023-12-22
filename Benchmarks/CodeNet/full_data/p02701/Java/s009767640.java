import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String[] S=new String[N];
        String Si;
        int cnt=0;
        int flag;
        int a=0;
        for(int i=0;i<N;i++){
            ++cnt;
            flag=cnt;
            Si=sc.next();
            for(int j=0;j<a;j++)
                if(Si.equals(S[j])){
                    --cnt;
                    break;
                }
            if(flag==cnt){
                S[a]=Si;
                ++a;
            } 
        }
        System.out.println(cnt);
    }
}
