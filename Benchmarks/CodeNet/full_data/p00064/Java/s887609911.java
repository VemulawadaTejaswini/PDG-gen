import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int ret=0;
		while(s.hasNext()){
			String str=s.next();
			String [] a=str.split("[a-zA-Z.]");
			for(int i=0;i<a.length;i++){
				if(a[i].length()>0)ret+=Integer.parseInt(a[i]);
			}
		}
		System.out.println(ret);
	}
}