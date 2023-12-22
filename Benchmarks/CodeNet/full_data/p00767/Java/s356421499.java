import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] data=new int[101][2];
		ArrayList<Integer> resulth=new ArrayList<Integer>();
		ArrayList<Integer> resultw=new ArrayList<Integer>();
		int j=0;
		
		while(true){
			data[j][0]=sc.nextInt();
			data[j][1]=sc.nextInt();
			if(data[j][0]==0&&data[j][1]==0)break;
			j++;
		}
		
		for(int i=0;i<j;i++){
			int[] renum=new int[2];
			renum=forfor(data[i][0],data[i][1]);
			resulth.add(renum[0]);		
			resultw.add(renum[1]);		
		}
		for(int i=0;i<resulth.size();i++)System.out.println(""+resulth.get(i)+" "+resultw.get(i));
	}
	public static int[] forfor(int h,int w){
		int[] re=new int[2];
		int hh=h*h;
		int ww=w*w;
		int now=hh+ww;
		int minlen=150;
		int minum=150*149;
		for(int i=1;i<=150;i++){
			for(int k=1;k<i;k++){
				int ii=i*i;
				int kk=k*k;
				int num=ii+kk;
				if((num>now&&minlen>k&&minum>=num)||(num==now&&k>h)){
					re[0]=k;
					re[1]=i;
					minlen=k;
					minum=num;
				}	
			}
				
		}
		return re;
	}
}