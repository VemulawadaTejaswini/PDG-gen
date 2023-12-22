import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String s = sc.next();
			if(s.compareTo("0")==0) break;
			
			int n = s.length();
			char[] a = s.toCharArray();
			ArrayDeque<char[]> que = new ArrayDeque<char[]>();
			ArrayList<String> list = new ArrayList<String>();
			boolean flag = false;
			boolean check = false;
			String t;
			
			for(int k=1;k<n;k++){
				if(a[k]!=a[0]){
					flag = true;
					break;
				}
			}
			if(flag==false){
				System.out.println(0);
			}else{
				que.offer(a);
				list.add(s);
				for(int z=1;;z++){
					int y = que.size();
					check = false;
					for(int i=0;i<y;i++){
						char[] b = que.peek();
						
						for(int j=0;j<n-1;j++){
							char[] c = b.clone();
							if(b[j]=='r' && b[j+1]=='g'){
								c[j] = 'b';
								c[j+1] = 'b';
							}else if(b[j]=='g' && b[j+1]=='r'){
								c[j] = 'b';
								c[j+1] = 'b';
							}else if(b[j]=='g' && b[j+1]=='b'){
								c[j] = 'r';
								c[j+1] = 'r';
							}else if(b[j]=='b' && b[j+1]=='g'){
								c[j] = 'r';
								c[j+1] = 'r';
							}else if(b[j]=='b' && b[j+1]=='r'){
								c[j] = 'g';
								c[j+1] = 'g';
							}else if(b[j]=='r' && b[j+1]=='b'){
								c[j] = 'g';
								c[j+1] = 'g';
							}
							StringBuffer sb = new StringBuffer();
							for(int k=0;k<n;k++) sb.append(c[k]);
							t = sb.toString();
							
							flag = false;
							
							for(int k=1;k<n;k++){
								if(c[k]!=c[0]){
									flag = true;
									break;
								}
							}
							
							if(flag==false){
								System.out.println(z);
								check = true;
								j = n;
								i = y;
							}else if(list.contains(t)==false){
								check = true;
								list.add(t);
								que.offer(c);
							}
	
						}
						if(check==false){
							System.out.println("NA");
							i = y;
						}
						que.poll();
					}
					if(flag==false || check==false) break;
				}
			}
		}	
	}	
}