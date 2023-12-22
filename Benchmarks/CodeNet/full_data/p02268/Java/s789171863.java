import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++) s[i]=sc.nextInt();
        int q=sc.nextInt();
        int cnt=0;
        if(n<10){
            for(int i=0;i<q;i++){
                int t=sc.nextInt();
                for(int j=0;j<n;j++){
                    if(t==s[j]){
                        cnt++;
                        break;
                    }
                }
            }
        }else{
            for(int j=0;j<q;j++){
                int t=sc.nextInt();
                if(t>s[n/2]){
                    for(int k=n/2+1;k<n;k++){
                        if(t==s[k]){
                            cnt++;
                            break;
                        }
                    }
                }else{
                    for(int k=0;k<=n/2;k++){
                        if(t==s[k]){
                            cnt++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
