import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String...args) throws IOException{
		Scanner r = new Scanner(System.in);
		int M,N;
		M=Integer.parseInt(r.next());
		N=Integer.parseInt(r.next());
		int[] man = new int[M];
		int[] kazu = new int[N];
		int[] hako = new int[N];
		int[] value = new int[N];
		int tmp,index;
		int manin,hakoin;
		int total;
		int[] hakonum = new int[10001];
		for(int i=0;i<M;i++){
			man[i]=Integer.parseInt(r.next());
		}
		for(int i=0;i<N;i++){
			kazu[i]=Integer.parseInt(r.next());
			hako[i]=Integer.parseInt(r.next());
			value[i]=hako[i]/kazu[i];
		}
		Arrays.sort(man);
		for(int i=0;i<N-1;i++){
			tmp=value[i];
			index=i;
			for(int j=i+1;j<N;j++){
				if(tmp>value[j]){
					tmp=value[j];
					index=j;
				}
			}
			value[index]=value[i];
			value[i]=tmp;
			tmp=kazu[index];
			kazu[index]=kazu[i];
			kazu[i]=tmp;
			tmp=hako[index];
			hako[index]=hako[i];
			hako[i]=tmp;
		}

		hakoin=total=0;
		manin=M-1;
		int flag=0;
		int ans=0;
		int max = 0;
		int maxnum = 0;
		while(true){
			Arrays.fill(hakonum,0);
			hakonum[0] = 1;
			max = 0;
			maxnum = 0;
			index = N;
			if(manin < 0){
				break;
			}
			for(int i=0;i<N;i++){
				ans=0;
				if(hakonum[kazu[i]] == 1){
					continue;
				}
				if(man[manin]>value[i]){
					for(int j=0;j<kazu[i];j++){
						if(-j+manin == -1){
							break;
						}
						ans+=man[-j+manin];
					}
				}
				if(ans-hako[i]>max){
					max =ans-hako[i];
					maxnum = kazu[i];
					index = i;
				}
			}
			if(max > 0){
				total += max;
				manin -= maxnum;
				kazu[index] = 0;
			}else{
				break;
			}
		}

		System.out.println(total);
	}
}