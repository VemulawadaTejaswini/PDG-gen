import java.util.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int[] cost=new int[201];
for(int i=-100;i<=100;i++){int temp=0;
    for(int j=0;j<N;j++){int[] a=new int[N];a[j]=sc.nextInt();
    temp+=Math.pow((a[j]-i),2);
        }
    cost[i]=temp;
    }
Arrays.sort(cost);
System.out.println(cost[0]);
}
}