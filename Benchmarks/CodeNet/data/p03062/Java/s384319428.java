import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
      	int max=0,sum,check;
      	
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
      	sc.close();
      	for(int i=0;i<N-1;i++){
          	check=i;
          	sum=0;
          	for(int j=0;j<N;j++){
              if(check==j||check+1==j){
                sum+=a[i]*(-1);
              }else if(a[i]<=0){
                sum+=a[i];
              }
            }
          	if(max<sum)max=sum;
        }
		System.out.println(max);
	}
}