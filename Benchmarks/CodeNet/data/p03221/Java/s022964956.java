import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	static int N,M;
	static int P[],Y[],ord[],Fcity[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();//市辖区的个数
		M=sc.nextInt();//city的总个数
		P=new int[M];
		Y=new int[M];
		ord=new int[M];
		Fcity=new int[M];
		List<data> list=new ArrayList<data>();
		int Ipre=0;
		int Icity=0;
		for(int i=0;i<M;i++) {
			Ipre=sc.nextInt();
			Icity=sc.nextInt();
			list.add(new data(Ipre,Icity,1));
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
					if(flag<0) {
						d2.setOrder(d1.getOrder()+1);
					}else{
						d1.setOrder(d2.getOrder()+1);
					}
				}
				return flag;
			}
		});
		
		//System.out.println("辖区       城市     ");
		int k=0;
		for(data s : list){
			P[k]=s.getPre();
			Y[k]=s.getCity();
			ord[k]=s.getOrder();
			k++;
		}
		int m=0;
		while(m<M) {
			for(int i=0;i<M;i++) {
				if(Fcity[m]==Y[i]) {
					System.out.println(calPStr(P[i])+calPStr(ord[i]));;
				}
			}
			m++;
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
	private int order;
	
	public data(int pre, int city,int order) {
		super();
		this.pre = pre;
		this.city = city;
		this.order=order;
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
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
}
