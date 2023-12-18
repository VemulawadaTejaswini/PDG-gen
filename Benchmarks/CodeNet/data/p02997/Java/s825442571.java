import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        sc.close();
        int max=((n-1)*(n-2))/2;
        if(k>max){
            System.out.println(-1);
            return;
        }
        int plus=max-k;
        int m=n-1+plus;
        StringBuilder sb=new StringBuilder();
        for(int v=2;v<=n;v++) sb.append(1+" "+v+"\n");

        for(int u=2;u<=n-1;u++){
            for(int v=u+1;v<=n;v++){
                if(plus==0) break;
                sb.append(u+" "+v+"\n");
                plus--;
            }
            if(plus==0) break;
        }
        System.out.println(m);
        System.out.println(sb);
    }
}