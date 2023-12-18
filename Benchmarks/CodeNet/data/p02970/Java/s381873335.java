import java.util.*;
public class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int D=s.nextInt();
        int check=N/D;
        int ans=0;
        if(N<=2*D+1){
        System.out.print(1);
        }
        else{
        if(check%2!=0){
        ans=check/2+1;
        }
        else{
        ans=check/2;
        }
if(N%D!=0){
ans+=1;
}

System.out.print(ans);
        }

}
}
