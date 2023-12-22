import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
for(;;){
int n=sc.nextInt();
int m=sc.nextInt();
if(n==0&&m==0)break;
int map[]= new int[n];int me[]= new int[m];
for(int i=0;i<n;i++)map[i]=sc.nextInt();
for(int i=0;i<m;i++)me[i]=sc.nextInt();
int now=0,ans=0;
while(true){
	now+=me[ans];
	ans++;
	if(now>n-2)break;
	now+=map[now];
	if(now>n-2)break;  
}
System.out.println(ans);
 }
}
}