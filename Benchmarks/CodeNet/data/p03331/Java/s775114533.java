import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int ans=2147483647,j,digsumi=0,digsumj=0;
for(int i=1;i<=N;i++){
j=N-i;
int tempi=i,tempj=j;
while(tempi!=0||tempj!=0){
digsumi+=tempi%10;
tempi/=10;
digsumj+=tempj%10;
tempj/=10;
}
ans=Math.min(ans, digsumi+digsumj);
}

System.out.println(ans);

}
}