import java.util.*;
public class Taro_shopping{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n;
	int m;
	int[] cost;
	int max;
	int tmp;
	while(hasNextLine()){
	    n=sc.nextInt();    //品物の個数
	    m=sc.nextInt();    //最大の金額
	    if(n!=0 && m!=0){
		cost=new int[n];
		max=0;
		tmp=0;
		for(int i=0;i<n;i++){
		    cost[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		    for(int j=i+1;j<n;j++){
			tmp=cost[i]+cost[j];
			if(tmp>max && tmp<=m){
			    max=tmp;
			}
		    }
		}
		System.out.println(max);
	    }
	}
    }
}
