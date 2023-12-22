import java.util.*;
class Main{
	static String rev(String a){
		String ret="";
		for(int i=a.length()-1;i>=0;i--)ret+=a.charAt(i);
		return ret;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for(int i=0;i<a;i++){
			String str=s.next();
			HashMap<String,Integer> map=new HashMap<String,Integer>();
			int ret=0;
			for(int j=1;j<str.length();j++){
				String s1=str;
				String s2=str.substring(0,j)+rev(str.substring(j));
				String s3=rev(str.substring(0,j))+str.substring(j);
				String s4=rev(str.substring(0,j))+rev(str.substring(j));
				String s5=str.substring(j)+str.substring(0,j);
				String s6=str.substring(j)+rev(str.substring(0,j));
				String s7=rev(str.substring(j))+str.substring(0,j);
				String s8=rev(str.substring(j))+rev(str.substring(0,j));
				if(!map.containsKey(s1)){
					ret++;
					map.put(s1,1);
				}
				if(!map.containsKey(s2)){
					ret++;
					map.put(s2,1);
				}
				if(!map.containsKey(s3)){
					ret++;
					map.put(s3,1);
				}
				if(!map.containsKey(s4)){
					ret++;
					map.put(s4,1);
				}
				if(!map.containsKey(s5)){
					ret++;
					map.put(s5,1);
				}
				if(!map.containsKey(s6)){
					ret++;
					map.put(s6,1);
				}
				if(!map.containsKey(s7)){
					ret++;
					map.put(s7,1);
				}
				if(!map.containsKey(s8)){
					ret++;
					map.put(s8,1);
				}
			}
			System.out.println(ret);
		}
	}
}