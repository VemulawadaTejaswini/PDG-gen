import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean flag[]=new boolean[64];
		List<List<Integer>> mask=new ArrayList<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			int k=Integer.parseInt(in.next());
			List<Integer> ls=new ArrayList<>();
			for(int j=0;j<k;j++)ls.add(Integer.parseInt(in.next()));
			mask.add(ls);
		}
		
		int m=in.nextInt();
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<m;i++) {
			int odr=Integer.parseInt(in.next());
			
			switch(odr){
				case 0:
					int index0=Integer.parseInt(in.next());
					out.println((flag[index0])? 1:0);
					break;
					
				case 1:
					int index1=Integer.parseInt(in.next());
					for(int j=0;j<mask.get(index1).size();j++)flag[mask.get(index1).get(j)]=true;
					break;
					
				case 2:
					int index2=Integer.parseInt(in.next());
					for(int j=0;j<mask.get(index2).size();j++)flag[mask.get(index2).get(j)]=false;
					break;
					
				case 3:
					int index3=Integer.parseInt(in.next());
					for(int j=0;j<mask.get(index3).size();j++)flag[mask.get(index3).get(j)]=(flag[mask.get(index3).get(j)])? false:true;
					break;
					
				case 4:
					int index4=Integer.parseInt(in.next());
					int cnt1=0;
					for(int j=0;j<mask.get(index4).size();j++)if(flag[mask.get(index4).get(j)])cnt1++;
					if(cnt1==mask.get(index4).size())out.println(1);
					else out.println(0);
					break;
					
				case 5:
					int index5=Integer.parseInt(in.next());
					int cnt2=0;
					for(int j=0;j<mask.get(index5).size();j++)if(flag[mask.get(index5).get(j)])cnt2++;
					if(cnt2>0)out.println(1);
					else out.println(0);
					break;
					
				case 6:
					int index6=Integer.parseInt(in.next());
					int cnt3=0;
					for(int j=0;j<mask.get(index6).size();j++)if(flag[mask.get(index6).get(j)])cnt3++;
					if(cnt3==0)out.println(1);
					else out.println(0);
					break;
					
				case 7:
					int index7=Integer.parseInt(in.next());
					int cnt4=0;
					for(int j=0;j<mask.get(index7).size();j++)if(flag[mask.get(index7).get(j)])cnt4++;
					out.println(cnt4);
					break;
					
				case 8:
					int index8=Integer.parseInt(in.next());
					long dec=0;
					for(int j=0;j<mask.get(index8).size();j++) {
						if(flag[mask.get(index8).get(j)]) {
							dec+=pow(mask.get(index8).get(j));
						}
					}
					out.println(Long.toUnsignedString(dec));
					break;
			}
		}
		out.flush();
	}
	
	static long pow(int p) {
		long res=1;
		for(int i=0;i<p;i++)res*=2;
		return res;
	}

}
