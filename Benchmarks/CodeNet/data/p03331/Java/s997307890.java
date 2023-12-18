import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int ans=2147483647,digsumi=0,digsumj=0;
for(int i=1;i<N;i++){
int tempi=i,tempj=N-i;
while(tempi>0){
digsumi+=tempi%10;
tempi/=10;
}
while(tempj>0){
digsumj+=tempj%10;
tempj/=10;
}
ans=Math.min(ans, digsumi+digsumj);
digsumi=0;digsumj=0;
}

System.out.println(ans);

}
}