import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int my[]={1872000,144000,7200,360,20,1};
		int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
		while(true){
			String str=s.next();
			if(str.equals("#"))break;
			String[]num=str.split("\\.");
			int []n=new int[num.length];
			for(int i=0;i<n.length;i++)n[i]=Integer.parseInt(num[i]);
			if(num.length==3){
				if(n[0]==2012){
					System.out.println("0.0.0.0."+(n[2]-21));
				}else{
					long val=11;
					int Y=2013;
					n[1]--;n[2]--;
					while(Y+400<n[0]){
						Y+=400;
						val+=146097;
					}
					while(Y<n[0]){
						if(Y%4==0&&(Y%100!=0||Y%400==0))val++;
						val+=365;
						Y++;
					}
					int M=0;
					while(M<n[1]){
						if(M==1&&Y%4==0&&(Y%100!=0||Y%400==0))val++;
						val+=mon[M];
						M++;
					}
					val+=n[2];
					
					long ret[]=new long[5];
					for(int i=0;i<5;i++)ret[i]=val%my[i]/my[i+1];
					System.out.println(ret[0]+"."+ret[1]+"."+ret[2]+"."+ret[3]+"."+ret[4]);
				}
			}else{
				int day=0;
				for(int i=1;i<=num.length;i++)day+=n[i-1]*my[i];
				if(day<=10){
					System.out.println("2012.12."+(21+day));
				}else{
					day-=11;
					int Y=2013;
					int M=0;
					while(day>=146097){day-=146097;Y+=400;}
					while(day>=365+((Y%4==0&&(Y%100!=0||Y%400==0))?1:0)){
						day-=365+((Y%4==0&&(Y%100!=0||Y%400==0))?1:0);
						Y++;
					}
					while(day>=mon[M]+((M==1&&(Y%4==0&&(Y%100!=0||Y%400==0)))?1:0)){
						day-=mon[M]+((M==1&&(Y%4==0&&(Y%100!=0||Y%400==0)))?1:0);
						M++;
					}
					System.out.println(Y+"."+(M+1)+"."+(day+1));
				}
			}
		}
	}
}