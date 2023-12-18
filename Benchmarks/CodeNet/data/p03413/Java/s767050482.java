import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Long> s = new ArrayList<>();
		
		long odd=0, even=0;
		ArrayList<Boolean> o = new ArrayList<>();
		ArrayList<Boolean> e = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			s.add(sc.nextLong());
			if(i%2==1 && s.get(i)>0){
				odd += s.get(i);
				o.add(true);
			}
			else{
				o.add(false);
			}
			if(i%2==0 && s.get(i)>0){
				even += s.get(i);
				e.add(true);
			}
			else{
				e.add(false);
			}
		}
		
		StringBuilder op = new StringBuilder();
		int cnt = 0;
		if(odd==0 && even==0){
			long max = Long.MIN_VALUE;
			int idx = 0;
			for(int i=0;i<n;i++){
				if(s.get(i)>max){
					max = s.get(i);
					idx = i;
				}
			}
			
			for(int i=0;i<idx;i++){
				op.append(1+"\n");
			}
			for(int i=idx+1;i<s.size();i++){
				op.append(2+"\n");
			}
			cnt = s.size()-1;
			
		}else if(odd>even){
			while(!o.get(0)){
				op.append(1+"\n");
				o.remove(0);
				s.remove(0);
				cnt++;
			}
			System.out.println(s);
			while(!o.get(o.size()-1)){
				op.append(o.size()+"\n");
				o.remove(o.size()-1);
				s.remove(s.size()-1);
				cnt++;
			}
			System.out.println(s);
			int p = 1;
			while(p<s.size()){
				if(o.get(p-1) && o.get(p+1)){
					s.set(p, s.get(p-1) + s.get(p+1));
					s.remove(p+1);
					s.remove(p-1);
					o.set(p, true);
					o.remove(p+1);
					o.remove(p-1);
					
					op.append(p+1);
					cnt++;
				}
				else if(!o.get(p-1) && !o.get(p+1)){
					s.set(p, s.get(p-1) + s.get(p+1));
					s.remove(p+1);
					s.remove(p-1);
					o.set(p, false);
					o.remove(p+1);
					o.remove(p-1);
					op.append(p+1+"\n");
					cnt++;
				}
				else{
					p++;
				}
			}
			System.out.println(s);
		}else{
			while(!e.get(0)){
				op.append(1+"\n");
				e.remove(0);
				s.remove(0);
				cnt++;
			}
			while(!e.get(e.size()-1)){
				op.append(e.size()+"\n");
				e.remove(e.size()-1);
				s.remove(s.size()-1);
				cnt++;
			}
			
			int p = 1;
			while(p<s.size()){
				if(e.get(p-1) && e.get(p+1)){
					s.set(p, s.get(p-1) + s.get(p+1));
					s.remove(p+1);
					s.remove(p-1);
					e.set(p, true);
					e.remove(p+1);
					e.remove(p-1);
					
					op.append(p+1+"\n");
					cnt++;
				}
				else if(!e.get(p-1) && !e.get(p+1)){
					s.set(p, s.get(p-1) + s.get(p+1));
					s.remove(p+1);
					s.remove(p-1);
					e.set(p, false);
					e.remove(p+1);
					e.remove(p-1);
					op.append(p+1);
					cnt++;
				}
				else{
					p++;
				}
			}
		}
		
		System.out.println(s.get(0));
		System.out.println(cnt);
		System.out.print(op);
	}
}
