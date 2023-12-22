import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.next();
			char[] a = s.toCharArray();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int count = 0;
			list.add(1);
			for(int i=1;i<a.length;i++){
				if(a[i]==a[i-1]){
					count++;
				}else{
					if(list.contains(count)==false) list.add(count);
					count=1;
				}
			}
			if(list.contains(count)==false) list.add(count);
			Collections.sort(list);
			
			StringBuffer sb;
			int k = 0;
			boolean flag = false;
			for(int i=0;i<list.size();i++){
				k = list.get(list.size()-1-i);
				if(k*3<=s.length()){
					sb = new StringBuffer();
					for(int j=0;j<k;j++) sb.append("J");
					for(int j=0;j<k;j++) sb.append("O");
					for(int j=0;j<k;j++) sb.append("I");
					if(s.contains(sb)==true){
						flag = true;
						break;
					}
				}
			}
			if(flag==true) System.out.println(k);
			else System.out.println("0");
		}
	}
}