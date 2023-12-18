import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	int[] M=new int[sc.nextInt()];
	Arrays.fill(M,0);
	
	String[] job=new String[10^4];
	Arrays.fill(job,"");//初期化せずに足していくとnull1,2,……となる？？？
	int tmp;
	for(int i=0;i<N;i++){
		tmp=sc.nextInt()-1;
		job[sc.nextInt()-1]+=tmp+",";//job[報酬-1]=日数,日数,日数……
	}
	int maxtmp=0;
	for(int i=10^4-1;i>0;i--)if(job[i]!="")job[i]=job[i].substring(0,job[i].length()-1);

	for(int i=10^4-1;i>0;i--){
		if(job[i]!=""){
			String[] st=job[i].split(",");
			Arrays.sort(st);
			for(String t:st){
				for(int j=Integer.valueOf(t).intValue();j<M.length;j++){
					if(M[j]==0){
						M[j]=i+1;
						break;
					}
				}
			}
			if(i%5==0){
				boolean next=true;
				for(int j:M)if(j==0)next=false;
				if(next)break;
			}
		}
	}
	int r=0;
	for(int i:M)r+=i;
	System.out.println(r);
 }
}