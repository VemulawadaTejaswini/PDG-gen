import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        sc.close();
        int n=0, m=0;
        while(l>=(1<<n++));n--;
        StringBuilder sb =new StringBuilder();
        for(int bit=1;bit<n;bit++, m+=2){
            sb.append(bit+" "+(bit+1)+" "+0+"\n"+bit+" "+(bit+1)+" "+(1<<(bit-1))+"\n");
            if((l&(1<<(bit-1)))!=0){
                sb.append(bit+" "+n+" "+(l>>bit<<bit)+"\n");
                m++;
            }
        }
        System.out.println(n+" "+m);
        System.out.print(sb);
    }
}
