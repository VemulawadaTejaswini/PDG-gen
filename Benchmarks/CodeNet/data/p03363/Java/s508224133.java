import java.util.*;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int answer=0;
int[] arr = new int[N];
for(int i=0;i<N;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
  for(int j=N-1;j>=0;j--){
    if(i<=j){
      int sum=0;
    for(int x=i;x<=j;x++)  {
      sum+=arr[x];
    }
    if(sum==0)
    answer++;
    }

  }
}
System.out.println(answer);
}
}
