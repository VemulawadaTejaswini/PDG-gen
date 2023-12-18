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
  int sum=0;
  for(int j=i;j<N;j++){
    sum+=arr[j];
    if(sum==0)
    answer++;
  }
}
System.out.println(answer);
}
}
