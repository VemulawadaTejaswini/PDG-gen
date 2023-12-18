import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

int x= sc.nextInt();

int []y=new int[x];
y[0]=1;
int max=y[0];
for(int i=2; i<x; i++){
	int ans=i;
	while(ans<x){
		ans=ans*i;
		if(ans<x){
			y[i-1]=ans;
		}
	}
}
for(int i=1; i<x;i++){
	if(max<y[i]){
		max=y[i];
	}
}
		System.out.println(max);

}
}
