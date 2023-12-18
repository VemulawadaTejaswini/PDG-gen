import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	static int N,M;
	static int P[],Y[],ord[],Fcity[];
	static String Answer[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();//市辖区的个数
		M=sc.nextInt();//city的总个数
		P=new int[M];
		Y=new int[M];
		ord=new int[M];
		Fcity=new int[M];
		Answer=new String[M];
		List<data> list=new ArrayList<data>();
		int Ipre=0;
		int Icity=0;
		for(int i=0;i<M;i++) {
			Ipre=sc.nextInt();
			Icity=sc.nextInt();
			list.add(new data(Ipre,Icity));
			Fcity[i]=Icity;
		}
		
		Collections.sort(list,new Comparator<data>() {

			@Override
			public int compare(data d1, data d2) {
				int flag;
				// 首选按辖区排序
				flag = d1.getPre()-d2.getPre();
				if(flag==0){
					// 再按城市建立年份升序排序
					flag = d1.getCity()-d2.getCity();
				}
				return flag;
			}
		});
		
		//System.out.println("辖区       城市     ");
		int k=0;
		for(data s : list){
			P[k]=s.getPre();
			Y[k]=s.getCity();
			//System.out.println(s.getPre()+"   "+s.getCity());
			k++;
		}
		
		ord[0]=1;
		
		for(int i=1;i<M;i++) {
			if(P[i]==P[i-1]) {
				ord[i]=ord[i-1]+1;
			}else {
				ord[i]=1;
			}
		}
		/*
		for(int i=0;i<M;i++) {
			System.out.println(P[i]+" "+Y[i]+" "+ord[i]+" ");
		}
		*/
		int m=0;
		while(m<M) {
			for(int i=0;i<M;i++) {
				if(Fcity[m]==Y[i]) {
					Answer[m]=calPStr(P[i])+calPStr(ord[i]);
				}
			}
			m++;
		}
		
		for(int i=0;i<M;i++) {
			System.out.println(Answer[i]);
		}
		
		
	}
	public static String calPStr(int p) {
		String str = null;
		if(p<9) {
			str="00000"+String.valueOf(p);
		}
		if(p<99 && p>=10) {
			str="0000"+String.valueOf(p);
		}
		if(p<999 && p>=100) {
			str="000"+String.valueOf(p);
		}
		
		if(p<9999 && p>=1000) {
			str="00"+String.valueOf(p);
		}
		
		if(p<99999 && p>=10000) {
			str="0"+String.valueOf(p);
		}
		
		if(p<999999 && p>=100000) {
			str=String.valueOf(p);
		}
		
		return str;
	}
}


class data{
	private int pre;
	private int city;
	
	public data(int pre, int city) {
		super();
		this.pre = pre;
		this.city = city;
	}
	public int getPre() {
		return pre;
	}
	public void setPre(int pre) {
		this.pre = pre;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
}
