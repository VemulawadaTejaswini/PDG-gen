import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] state=new int[M][3];
		for(int i=0;i<M;i++){
			state[i][0]=sc.nextInt();
			state[i][1]=sc.nextInt();
			state[i][2]=sc.nextInt();
		}
		String list="#";
		
		int result=depend(list,state,N);
		System.out.println(result);
	}
	
	public static int depend(String list,int[][] state,int N){
		//depend if ok
		if(list.length()>N) return 1;
		//depend
		boolean depend=true;
		for(int i=0;i<state.length;i++){
			if(list.length()>state[i][1]+1)continue;
			if(list.length()<state[i][0])continue;
			
			if(list.length()==state[i][1]+1){
			String temp=list.substring(state[i][0], Math.min(list.length(), state[i][1]+1));
			int count=0;
			if(temp.indexOf("r")!=-1)count++;
			if(temp.indexOf("g")!=-1)count++;
			if(temp.indexOf("b")!=-1)count++;
			if(count!=state[i][2]){
				depend=false;
				break;
			}
			}
		}
		if(!depend) return 0;
		return depend(list+"r",state,N)+depend(list+"g",state,N)+depend(list+"b",state,N);
	}
	
}