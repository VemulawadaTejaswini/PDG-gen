import java.awt.geom.*;
import java.util.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		new AOJ1282();
	}
	
	class AOJ1282{
		ArrayList<Integer> sizes;
		ArrayList<HashMap<Integer, Integer>> arrays;
		HashMap<String, Integer> names;
		AOJ1282(){
			while(true){
				String str=sc.next();
				if(str.equals("."))	break;
				// init
				sizes = new ArrayList<Integer>();
				arrays = new ArrayList<HashMap<Integer, Integer>>();
				names = new HashMap<String, Integer>();
				int cnt=1, ans=0;
				
				while(!str.equals(".")){
					// solve
					if(ans<=0){
						if(str.contains("=")){
							if( !f1(str) )	ans=cnt;
						}else{
							f2(str);
						}
					}
					str=sc.next();
					++cnt;
				}
				System.out.println(ans);
			}
		}
		boolean f1(String str){
			int eq = str.indexOf("=");
			String left = str.substring(0, eq),
					right = str.substring(eq+1);
			String lname = left.substring(0,1),
					lb = left.substring(2,left.length()-1);
			int l = f3(lb);
			int r = f3(right);
			if(l<0 || r<0)	return false;
			if(l>=sizes.get(names.get(lname)))	return false;
			arrays.get(names.get(lname)).put(l, r);
			return true;
		}
		int f3(String str){
			int ret=-1;
//			System.out.println(str);
			try{
				ret = Integer.parseInt(str);
			}catch(NumberFormatException e){
				int idx = str.indexOf("[");
				String name = str.substring(0, idx),
						str2 = str.substring(idx+1,str.length()-1);
				int n=f3(str2);
				if(n<0)	return -1;
				int a = names.get(name);
				if(sizes.get(a) <= n)	return -1;
				if(!arrays.get(a).containsKey(n))	return -1;
				ret = arrays.get(a).get(n);
			}
			return ret;
		}
		void f2(String str){
			int idx = str.indexOf("[");
			String name = str.substring(0,idx);
			int size = Integer.parseInt(str.substring(idx+1, str.length()-1));
//			System.out.println(name+" "+size);
			
			names.put(name, arrays.size());
			sizes.add(size);
			arrays.add(new HashMap<Integer, Integer>());
			
		}
	}
}