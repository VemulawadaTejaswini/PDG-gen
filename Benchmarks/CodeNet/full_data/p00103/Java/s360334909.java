import java.io.*;
class Baseball{
	private int point=0;
	private int out=0;
	private int[] Runner =new int[4];
	public Baseball(){}
	int HIT(){
		for(int i=3;i>0;i--){
			Runner[i]=Runner[i-1];
		}
		Runner[0]=1;
		point+=Runner[3];
		Runner[3]=0;
		return 0;
	}
	int HOMERUN(){
		for(int i=0;i<Runner.length;i++){
			point+=Runner[i];
			Runner[i]=0;
		}
		point++;
		return 0;
	}
	int OUT(){
		out++;
		if(out==3){
			for(int i=0;i<Runner.length;i++){
				Runner[i]=0;
			}
			out=0;
			return 1;
		}
		return 0;
	}
		
	int get(){
		int temp=point;
		point =0;
		return temp;
	}
	int acction(String s){
		if(s.equals("HIT")){
			return HIT();
		}else if(s.equals("OUT"))
			return OUT();
		else if(s.equals("HOMERUN"))
			return HOMERUN();
	return 0;
	}
}
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br
			= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Baseball baseball=new Baseball();
		int i=0;
		while(true){
			int j;
			i+=j=baseball.acction(br.readLine());
			if(j==1)System.out.println(baseball.get());
			if(n==i)break;
		}
	}
}