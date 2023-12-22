import java.util.*;

public class Main {
	
	boolean dd(int a, int b, int c, int d){
		int p, q;
		String s = "";
		String t = "";
		for(int i=0;i<4;i++){
			if(i==0) p = a+b;
			else if(i==1) p = a-b;
			else if(i==2) p = b-a;
			else p = a*b;
			for(int j=0;j<4;j++){
				if(j==0) q = c+d;
				else if(j==1) q = c-d;
				else if(j==2) q = d-c;
				else q = c*d;
				
				if(p+q==10 || p-q==10 || q-p==10 || p*q==10){
					if(i==0) s = "( " + a + " + " + b + " )";
					else if(i==1) s = "( " + a + " - " + b + " )";
					else if(i==2) s = "( " + b + " - " + a + " )";
					else s = "( " + a + " * " + b + " )";
					
					if(j==0) t = "( " + c + " + " + d + " )";
					else if(j==1) t = "( " + c + " - " + d + " )";
					else if(j==2) t = "( " + d + " - " + c + " )";
					else t = "( " + c + " * " + d + " )";
					
					if(p+q==10) s = s + " + " + t;
					else if(p-q==10) s = s + " - " + t;
					else if(q-p==10) s = t + " - " + s;
					else s = s + " * " + t;
					
					System.out.println(s);
					return true;
				}
			}
		}
		return false;
	} 
	
	boolean st(int a, int b, int c, int d){
		int p, q;
		String s = "";
		for(int i=0;i<4;i++){
			if(i==0) p = a+b;
			else if(i==1) p = a-b;
			else if(i==2) p = b-a;
			else p = a*b;
			for(int j=0;j<4;j++){
				if(j==0) q = c+p;
				else if(j==1) q = c-p;
				else if(j==2) q = p-c;
				else q = c*p;
				
				if(d+q==10 || d-q==10 || q-d==10 || d*q==10){
					if(i==0) s = "( " + a + " + " + b + " )";
					else if(i==1) s = "( " + a + " - " + b + " )";
					else if(i==2) s = "( " + b + " - " + a + " )";
					else s = "( " + a + " * " + b + " )";
					
					if(j==0) s = "( " + c + " + " + s + " )";
					else if(j==1) s = "( " + c + " - " + s + " )";
					else if(j==2) s = "( " + s + " - " + c + " )";
					else s = "( " + c + " * " + s + " )";
					
					if(d+q==10) s = "( " + d + " + " + s + " )";
					else if(d-q==10) s = "( " + d + " - " + s + " )";
					else if(q-d==10) s = "( " + s + " - " + d + " )";
					else s = "( " + d + " * " + s + " )";
					
					System.out.println(s);
					return true;
				}
			}	
		}
		return false;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] n = new int[4];
			for(int i=0;i<4;i++) n[i] = sc.nextInt();
			if(n[0]==0 && n[1]==0 && n[2]==0 && n[3]==0) break;
			
			boolean flag = false;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i!=j){
						for(int k=0;k<4;k++){
							if(i!=k && j!=k){
								for(int r=0;r<4;r++){
									if(i!=r && j!=r && k!=r){
										if(dd(n[i],n[j],n[k],n[r])==true || st(n[i],n[j],n[k],n[r])==true){
											flag = true;
											i=4;
											j=4;
											k=4;
											r=4;
										}
									}
								}
							}
						}
					}
				}
			}
			if(flag==false) System.out.println(0);
		}
	}
	
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}