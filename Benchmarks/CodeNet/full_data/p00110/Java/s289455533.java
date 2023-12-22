import java.util.*;
import java.math.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String line=s.next();
			String table[]=line.split("[+=]");
			boolean zero=true;
			int ans=-1;
			for(int i=0;i<3;i++)if(table[i].length()>1&&table[i].charAt(0)=='X')zero=false;
			for(int i=zero?0:1;i<10;i++){
				String val="";
				BigInteger bi=new BigInteger("0");
				for(int j=0;j<3;j++){
					val="";
					for(int k=0;k<table[j].length();k++){
						if(table[j].charAt(k)=='X')val+=""+i;
						else val+=table[j].charAt(k);
					}
					if(j!=2)bi=bi.add(new BigInteger(val));
					else bi=bi.add(new BigInteger("-"+val));
				}
				if(bi.toString().equals("0"))ans=i;
			}
			if(ans<0)System.out.println("NA");
			else System.out.println(ans);
		}
	}
}