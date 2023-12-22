import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[17];
		int[] out = new int[101];
		int[] time = new int[]{19,39,25,36,22,42};
		ArrayList<Integer> wait = new ArrayList<Integer>();
		Arrays.fill(a, -1);
		int p, q;
		boolean flag;
		boolean check;
		for(int i=0;i<567;i++){
			for(int j=0;j<17;j++){
				if(a[j]==i) a[j] = -1;
			}
			if(i%5==0) wait.add(i/5);
			while(wait.size()!=0){
				check = false;
				p = wait.get(0);
				q = 2;
				if(p%5==1) q = 5;
				
				for(int j=0;j<18-q;j++){
					flag = true;
					for(int k=0;k<q;k++){
						if(a[j+k]!=-1) flag = false;
					}
					if(flag==true){
						out[p] = i+time[p%6];
						for(int k=0;k<q;k++) a[j+k] = out[p];
						check = true;
						wait.remove(0);
						break;
					}
				}
				if(check==false) break;
			}
		}

		
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(out[n]- time[n%6] - n*5);
		}	
	}	
}