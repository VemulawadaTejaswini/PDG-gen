import java.util.*;
public class Main {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int [] s = new int[S.length()];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='R') s[i]=0;
            else s[i] =1;
        }
        int r_num=0,l_num=0;
        for(int i=0;i<S.length();i++){
            if(s[i]==0) r_num++;
            else l_num++;
        }
        int opt =0;
        if(r_num>l_num){
            for(int i=0;i<K;i++){
                int first=-1,max_first=-1,fin=0,max_fin=0,max=0,num=0;
                for(int j=0;j<N;j++){
                    if(first==-1&&s[j]==1) first=j;
                    if(s[j]==1){
                        num++;
                        fin = j;
                        if(num>=max&&j==N-1){
                            if(num>=max){
                                max = num ;
                                max_first = first;
                                max_fin = fin;
                            }
                        }
                    }
                    else{
                        if(num>=max){
                            max = num ;
                            max_first = first;
                            max_fin = fin;
                        }
                        num =0;
                        first = -1;
                        fin = 0;
                    }
                }
                for(int j=max_first;j<=max_fin;j++) s[j]=0;
            }
            int num = 0;
            for(int i=0;i<N;i++){
                if(s[i]==0&&i==N-1) opt+=num;
                else if(s[i]==0) num++;
                else{
                    if(num!=0)opt+=(num-1);
                    num=0;
                }
            }
        }
        else{
            for(int i=0;i<K;i++){
                int first=-1,max_first=-1,fin=0,max_fin=0,max=0,num=0;
                for(int j=0;j<N;j++){
                    if(first==-1&&s[j]==0) first=j;
                    if(s[j]==0){
                        num++;
                        fin = j;
                        if(num>=max&&j==N-1){
                            if(num>=max){
                                max = num ;
                                max_first = first;
                                max_fin = fin;
                            }
                        }
                    }
                    else if(s[j]==1||j==N-1){
                        if(num>=max){
                            max = num ;
                            max_first = first;
                            max_fin = fin;
                        }
                        num =0;
                        first = -1;
                        fin = 0;
                    }
                }
                for(int j=max_first;j<=max_fin;j++) s[j]=1;
            }
            int num = 0;
            for(int i=0;i<N;i++){
                if(s[i]==1&&i==N-1) opt+=(num);
                else if(s[i]==1) num++;
                else{
                    if(num!=0)opt+=(num-1);
                    num=0;
                }
            }
        }
        System.out.println(opt);
    }
}
