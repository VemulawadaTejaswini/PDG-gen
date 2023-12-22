import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String t = sc.nextLine();
			if(t.compareTo("0")==0) break;
			
			int n = Integer.valueOf(t);
			int[] num = new int[n];
			int[] sum = new int[n];
			int[] tmps = new int[n];
			
			for(int k=0;k<n;k++){
				String[] s = sc.nextLine().split(" ");
				int len = s.length;
				int[] a = new int[len];
				for(int i=0;i<len;i++) a[i] = Integer.valueOf(s[i]);
				
				int count = 0;
				for(int i=1;;i++){
					if(a[i]==10){
						a[i] = a[i]+a[i+1]+a[i+2];
					}
					else if(a[i]+a[i+1]==10){
						a[i] = a[i]+a[i+2];
						i++;
					}else{
						i++;
					}
					count++;
					if(count==9) break;
				}
				for(int i=1;i<len;i++) sum[k] += a[i];
				num[k] = a[0];
			}
			tmps = sum.clone();
			Arrays.sort(tmps);
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(tmps[n-1-i]==sum[j]) list.add(num[j]);
				}
				Collections.sort(list);
				for(int j=0;j<list.size();j++){
					System.out.println(list.get(j) + " " + tmps[n-1-i]);
				}
				i+=list.size()-1;
				list.clear();
			}
			
		}
	}	
}