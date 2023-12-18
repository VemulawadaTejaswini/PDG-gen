import java.util.*;
public class Main {

	public static void main(String[] args) {
		//儅奇偶項需要換的數相同時，比較那個用的步驟比較少	

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int n=N/2;
		
		//兩個放取得的奇偶
		int	SetO[]=new int [n];
		int SetE[]=new int [n];
		//將數列分開奇偶項
		for(int i=0;i<n;i++) {
			SetO[i]=sc.nextInt();
			SetE[i]=sc.nextInt();
			//System.out.print("奇數："+SetO[i]);//檢查是否抓到奇數
			//System.out.print("偶數："+SetE[i]);
		}
		
		
		//將矩陣丟入判斷出現最多次數和出現最多的是什麽數的方法
		//max中第一位是出現最多的數，第二位是最多的出現次數,第三位是出現第二多的數，第四位是第二多的出現次數
		int [] maxO=new int[4];
		maxO=max(SetO,n);
		int [] maxE=new int[4];
		maxE=max(SetE,n);
		for(int i=0;i<4;i++){
		//System.out.println("maxO"+(i+1)+":"+maxO[i]);//檢查maxO是否取得set這種出現最多次數的數
		//System.out.println("maxE"+(i+1)+":"+maxE[i]);
	}
		
		//判斷奇數偶數出現最多的數是否相同
		if(maxO[0]==maxE[0]) {
			if((n-maxO[1] + n - maxE[3])<(n-maxE[1] + n - maxO[3])) // 條件是這樣
				System.out.println(n-maxO[1]+n-maxE[3]);
			else
				System.out.println(n-maxO[3]+n-maxE[1]);
		}
		//不同的話直接輸出需要變化數的和
		else
			System.out.println(n-maxO[1]+n-maxE[1]);
			
	}
	
	
	public static int[] max (int [] set,int n) {
		int max=0;
		int maxv=0;
		int maxS=0;
		int maxSv=0;		
		int [] re=new int[4];
		//計數矩陣
		
		int count[]=new int [100001];
		/* JAVA 裡陣列初始值已經是 0
		for(int i=0;i<100001;i++) {
			count[i]=0;
		}
		*/
		//比較后纍加
		for(int j=0;j<n;j++) {
			/*
			for(int f=1;f<10001;f++) {
				if(set[j]==f)
					count[f]++;
			}
			*/
			//等同於直接這樣寫
			count[set[j]]++;
		}
		//選出出現最多次
		//直接找最多次的值
		for(int i=0;i<100000;i++) {
			if(count[i]>count[maxv])
				maxv=i;
		}
		//選出出現最多次的值
		/*
				for(int f=0;f<100000;f++) {
					if(count[f]==max)
						maxv=f;
				}
		*/
		//選出次數第二多
		//直接找次多的值
		for(int i=0;i<100000;i++) {
			if(count[i]>count[maxSv] && i != maxv)
				maxSv=i;
		}
		
		//選出次數第二多的值
		/*
		for(int i=0;i<100000;i++) {
			if(count[i]==maxS)
				maxSv=i;
		}
		*/
		re[0]=maxv;
		re[1]=count[maxv];
		re[2]=maxSv;
		re[3]=count[maxSv];
		return re;
	}	
		
		
		
		
		
		

}
