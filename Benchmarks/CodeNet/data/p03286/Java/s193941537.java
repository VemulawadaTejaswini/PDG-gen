import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> mtwo=new ArrayList<Integer>();
		for(int k=1;Math.abs(k)<=1000000000;k*=-2) {
			mtwo.add(k);
		}
		ArrayList<Integer> amari=new ArrayList<Integer>();
		int num=Math.abs(N);
		boolean mae=false;
		boolean ze=false;
		String ans="";
		if(N>0) {
			while(num!=1) {
				amari.add(num%2);
//				System.out.println(num%2);
				num/=2;
//				System.out.println(num);
			}
			amari.add(num%2);
			for(int k=amari.size()-1;k>=0;k--) {
				int tem=amari.get(k);
				//System.out.println(tem);
				if(tem==1) {
					//System.out.println((int)Math.pow(2, k));
					if(mtwo.contains((int)Math.pow(2, k))) {
						
						if(mae)ans+="1";
						else ans+="01";
						mae=false;
					} else {
						ans+="11";
						mae=true;
					}
					ze=false;
					//ans=ans+"11";//ans.substring(0, ans.length()-1)+"11";
				}else {
					if(ze) ans+="0";
					ze=true;
				}
			}
			System.out.println(ans);
		} else if(N<0) {
			mae=true;
			while(num!=1) {
				amari.add(num%2);
				num/=2;
			}
			amari.add(num%2);
			for(int k=amari.size()-1;k>=0;k--) {
				int tem=amari.get(k);
				if(tem==1) {
					if(mtwo.contains((int)Math.pow(-2, k))) {
						
						if(mae)ans+="1";
						else ans+="01";
						mae=false;
					} else {
						ans+="11";
						mae=true;
					}
					ze=false;
				}else {
					if(ze) ans+="0";
					ze=true;
				}
			}
			System.out.println(ans);
		} else {
			System.out.println(0);
		}
	}
}
