import java.util.*;
class Main{
	static int[][] dim;
	static HashMap<String,Integer> map;
	static String fact;
	static int[]dame;
	static int[] solve(int a,int b){
		int kakko=0;
		int last=0;
		int N[][]=new int[100][dim[0].length];
		int K[]=new int[100];
		int at=0;
		String q="";
		for(int i=a;i<b;i++){
			if(fact.charAt(i)=='('){
				if(kakko==0)last=i;
				kakko++;
			}else if(fact.charAt(i)==')'){
				kakko--;
				if(kakko==0){
					N[at]=solve(last+1,i);
					if(N[at][0]==-99999999)return dame;
				}
			}else if(kakko==0){
				if(fact.charAt(i)=='+'){
		//	System.out.println(q);
					if(q.length()>0){
						N[at]=dim[map.get(q)];
					}
					K[at++]=1;
					q="";
				}
				else if(fact.charAt(i)=='-'){
		//	System.out.println(q);
					if(q.length()>0){
						N[at]=dim[map.get(q)];
					}
					K[at++]=2;
					q="";
				}
				else if(fact.charAt(i)=='*'){
	//		System.out.println(q);
					if(q.length()>0){
						N[at]=dim[map.get(q)];
					}
					K[at++]=3;
					q="";
				}
				else if(fact.charAt(i)=='/'){
		//	System.out.println(q);
					if(q.length()>0){
						N[at]=dim[map.get(q)];
					}
					K[at++]=4;
					q="";
				}else{
					q+=fact.charAt(i);
				}
			}
		}
		boolean OK=true;
	//	System.out.println(q);
		if(q.length()>0)N[at]=dim[map.get(q)];
		int []now=new int[dim[0].length];
		int []val=new int[dim[0].length];
		for(int i=0;i<dim[0].length;i++)now[i]=N[0][i];
		int Last=0;
	//	System.out.println(a+" "+b);
	//	System.out.println(Arrays.toString(now));
		for(int i=0;i<at;i++){
			if(K[i]<3&&Last>0){
				for(int j=0;j<dim[0].length;j++){
					if(now[j]!=val[j])return dame;
					now[j]=N[i+1][j];
				}
	//	System.out.println(i+" "+K[i]+" "+Arrays.toString(now));
			}else if(K[i]<3){
				for(int j=0;j<dim[0].length;j++){
					val[j]=now[j];
					now[j]=N[i+1][j];
				}
	//	System.out.println(i+" "+K[i]+" "+Arrays.toString(now));
				Last=1;
			}else if(K[i]==3){
				for(int j=0;j<dim[0].length;j++)now[j]+=N[i+1][j];
	//	System.out.println(i+" "+K[i]+" "+Arrays.toString(now));
			}else{
				for(int j=0;j<dim[0].length;j++)now[j]-=N[i+1][j];
	//	System.out.println(i+" "+K[i]+" "+Arrays.toString(now));
			}
		}
		if(Last>0){
	//	System.out.println(Arrays.toString(now));
			for(int j=0;j<dim[0].length;j++){
				if(now[j]!=val[j])return dame;
			}
		}else{
	//	System.out.println(Arrays.toString(now));
			for(int j=0;j<dim[0].length;j++){
				val[j]=now[j];
			}
		}
		return val;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			if(a+b+c==0)System.exit(0);
			dim=new int[b][a];
			dame=new int[a];
			dame[0]=-99999999;
			String name[]=new String[b];
			for(int i=0;i<b;i++){
				name[i]=s.next();
				for(int j=0;j<a;j++)dim[i][j]=s.nextInt();
			}
			fact=s.next();
			map=new HashMap<String,Integer>();
			for(int i=0;i<c;i++){
				String v=s.next();
				String w=s.next();
				for(int j=0;j<b;j++){
					if(name[j].equals(w)){
						map.put(v,j);
					}
				}
			}
			int []ans=solve(0,fact.length());
	//		for(int i=0;i<ans.length;i++)System.out.print(ans[i]+" ");
			if(ans[0]==-99999999){
				System.out.println("error");
			}else{
				boolean OK=false;
				for(int i=b-1;i>=0;i--){
					boolean ok=true;
					for(int j=0;j<a;j++)if(ans[j]!=dim[i][j])ok=false;
					if(ok){
						System.out.println(name[i]);
						OK=true;
						break;
					}
				}
				if(!OK)System.out.println("undefined");
			}
		}
	}
}