import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String[] str = new String[x];
		
		for(int i = 0; i < x; i++){
			int[] a = new int[2];
			int[] aa = new int[10];
			boolean[] is = new boolean[3];
			boolean xx = true;
			a[0] = 0; 
			a[1] = 0;
			
			for(int s = 0; s < 10; s++)
				aa[s] = sc.nextInt();
			
			for(int u = 0; u < 10; u++){
				is[0] = is[1] = is[2] =true;
				if(a[0] < aa[u]){
					a[0] = aa[u];
					is[0] = false;
				}
				else
					is[1] = false;
				if(a[1] < aa[u] && is[0])
					a[1] = aa[u];
				else
					is[2] = false;
				if(!is[1] && !is[2]){
					str[i] = "NO";
					xx = false;
					break;
				}
			}
			if(xx)
				str[i] = "YES";
		}
		for(int i = 0; i < x; i++)
			System.out.println(str[i]);
	}
}