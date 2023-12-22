import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new A();
	}
	
	class B {
		B(){
			while(true){
				int m = sc.nextInt();
				int n = sc.nextInt();
				int p = sc.nextInt();
				if((m |n|p) == 0)break;
				int [][][] data = new int[n][n][n];
				for(int i = 0 ; i < n; i++){
					for(int j = 0; j < n; j++){
						Arrays.fill(data[i][j], -1);
					}
				}
				boolean flg = false;
				String ans = "";
				for(int i = 0 ; i < p; i++){
					int x = sc.nextInt() - 1;
					int y = sc.nextInt() - 1;
					//set 
					for(int z = 0; z < n; z++){
						if(data[x][y][z] != -1){
							data[x][y][z] = 1;
						}
					}
					boolean res = check();
					if(res){
						flg = true;
						//TODO
						if(i % 2 == 0){
							ans = "Black " +(i + 1);
						}
						else{
							ans = "white " + (i + 1);
						}
					}
				}
				if(flg){
					System.out.println(ans);
				}
				else{
					System.out.println("Draw");
				}
			}
		}

		private boolean check() {
			
			return false;
		}
	}
	
	class A{
		final int INF=Integer.MAX_VALUE/4;
		A(){
			while(true){
				int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
				if(a==0 && b==0 && c==0)	break;
				solve(a,b,c);
			}
		}
		void solve(int A,int B,int C){
			int ansA=INF,ansB=INF,ansW=INF;
			for(int ab=1; ; ab++){
				for(int a=0; a<=ab; a++){
					if(a*A+(ab-a)*B==C){
						int tmpW=a*A+(ab-a)*B;
						if(ansW>tmpW){
							ansA=a;
							ansB=ab-a;
							ansW=tmpW;
						}
					}
					if(a*A-(ab-a)*B==C){
						int tmpW=a*A+(ab-a)*B;
						if(ansW>tmpW){
							ansA=a;
							ansB=ab-a;
							ansW=tmpW;
						}
					}
					if(a*B-(ab-a)*A==C){
						int tmpW=a*B+(ab-a)*A;
						if(ansW>tmpW){
							ansA=ab-a;
							ansB=a;
							ansW=tmpW;
						}
					}
				}
				if(ansW<INF)	break;
			}
			System.out.println(ansA+" "+ansB);
		}
//		void solve(int A,int B,int C){
//			int a1=0,b1=0,w1=0,a2=0,b2=0,w2=0;
//			int a3=0,b3=0,w3=0,a4=0,b4=0,w4=0;
//			boolean f1=true,f2=true,f3=true,f4=true;
//			ArrayList<AA> ans=new ArrayList<Main.A.AA>();
//			for(int i=1; f1&&f2&&f3&&f4; i++){
//				if(f1){
//					a1=i;
//					w1=A*i;
//					b1=0;
//					while(w1>C && w1-B>0){
//						b1++;
//						w1-=B;
//					}
//					if(w1==C){
//						ans.add(new AA(a1,b1,w1,a1*A+b1*B));
//						Collections.sort(ans);
//						f1=false;
//					}
//					//if(!ans.isEmpty() && (a1+b1>ans.get(0).a+ans.get(0).b || (a1+b1==ans.get(0).a+ans.get(0).b && a1*A+b1*B>=ans.get(0).w2)))f1=false;
//					if(!ans.isEmpty() && a1+b1>ans.get(0).a+ans.get(0).b)f1=false;
//				}
//				if(f2){
//					b2=i;
//					w2=B*i;
//					a2=0;
//					while(w2>C && w2-A>0){
//						a2++;
//						w2-=A;
//					}
//					if(w2==C){
//						ans.add(new AA(a2,b2,w2,a2*A+b2*B));
//						Collections.sort(ans);
//						f2=false;
//					}
//					//if(!ans.isEmpty() && (a2+b2>ans.get(0).a+ans.get(0).b || (a2+b2==ans.get(0).a+ans.get(0).b && a2*A+b2*B>=ans.get(0).w2)))f2=false;
//					if(!ans.isEmpty() && a2+b2>ans.get(0).a+ans.get(0).b)f2=false;
//				}
//				if(f3){
//					if(i%2==0){
//						a3++;
//						w3+=A;
//					}else{
//						b3++;
//						w3+=B;
//					}
//					if(w3==C){
//						ans.add(new AA(a3,b3,w3,a3*A+b3*B));
//						Collections.sort(ans);
//						f3=false;
//					}
//					//if(!ans.isEmpty() && (a3+b3>ans.get(0).a+ans.get(0).b || (a3+b3>ans.get(0).a+ans.get(0).b && a3*A+b3*B>=ans.get(0).w2)))f3=false;
//					if(!ans.isEmpty() && a3+b3>ans.get(0).a+ans.get(0).b)f3=false;
//				}
//				if(f4){
//					if(i%2==0){
//						b4++;
//						w4+=B;
//					}else{
//						a4++;
//						w4+=A;
//					}
//					if(w4==C){
//						ans.add(new AA(a4,b4,w4,a4*A+b4*B));
//						Collections.sort(ans);
//						f4=false;
//					}
//					//if(!ans.isEmpty() && (a4+b4>ans.get(0).a+ans.get(0).b || (a4+b4>ans.get(0).a+ans.get(0).b && a4*A+b4*B>=ans.get(0).w2)))f4=false;
//					if(!ans.isEmpty() && a4+b4>ans.get(0).a+ans.get(0).b)f4=false;
//				}
//				//System.out.println(w1+" "+w2+" "+w3+" "+w4);
//			}
//			Collections.sort(ans);
//			System.out.println(ans.get(0).a+" "+ans.get(0).b);
//			System.out.println(ans);
//		}
		class AA implements Comparable<AA>{
			int a,b,w,w2;
			AA(int a,int b,int w,int w2){
				this.a=a; this.b=b; this.w=w; this.w2=w2;
			}
			@Override public int compareTo(AA o) {
				if(this.a+this.b<o.a+o.b)return -1;
				if(this.a+this.b>o.a+o.b)return 1;
				if(this.w<o.w)return -1;
				if(this.w>o.w)return 1;
				return 0;
			}
			@Override public String toString(){return "("+a+","+b+")="+w;}
		}
	}

}