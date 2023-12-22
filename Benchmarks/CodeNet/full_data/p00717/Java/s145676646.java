import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main{
	
	public static Vec init(Vec v){
		int sx=v.x.get(0);
		int sy=v.y.get(0);
		
		for(int i=0;i<v.x.size();i++){
			v.x.set(i,v.x.get(i)-sx);
			v.y.set(i,v.y.get(i)-sy);
			
		}
		
		return v;
	}
	
	public static Vec roll(Vec v){
		for(int i=0;i<v.x.size();i++){
			int vx=v.x.get(i);
			int vy=v.y.get(i);
			v.x.set(i,-vy);
			v.y.set(i,vx);
			
		}
		return v;
	}
	
	public static void check(Vec v1,Vec v2,int num,int row){
		
		for(int i=0;i<4;i++){
			v2=roll(v2);
			//debug!!
			
			/*if(row==4&&num==4){
				System.out.println(v1);
				System.out.println(v2);
				System.out.println("===");
				
			}*/
			
			if(comp(v1,v2)){
				System.out.println(num);
				break;
			}
		}
	}
	
	
	public static boolean comp(Vec v1,Vec v2){
		if(v1.x.size()!=v2.x.size()) return false;
		for(int i=0;i<v2.x.size();i++){
			if((v1.x.get(i)!=v2.x.get(i))||(v1.y.get(i)!=v2.y.get(i))){
				return false; 
			}
		}
		return true;
	}
	
	public static Vec reverseVec(Vec v){
		Collections.reverse(v.x);
		Collections.reverse(v.y);
		return v;
		
		
	}
	
	
	
	
	public static void Solve(){
		int n,nodeN;
		Scanner stdin =new Scanner(System.in);
		ArrayList<Integer> px;
		ArrayList<Integer> py;
		ArrayList<Integer> x;
		ArrayList<Integer> y;
		
		
		int row=0;
		while(true){
			n=stdin.nextInt();
			row++;
			
			if(n==0) break;
				Vec v=null;
				for(int i=0;i<n+1;i++){
					ArrayList<Integer> ans=new ArrayList<Integer>();
					//if(i==2) break;
					if(i==0){
						nodeN=stdin.nextInt();
						px=new ArrayList<Integer>();
						py=new ArrayList<Integer>();
						
						for(int j=0;j<nodeN;j++){
							px.add(stdin.nextInt());
							py.add(stdin.nextInt());
						}
						
						v=new Vec(px,py);
						//System.out.println("init:"+v);
					}else{
						nodeN=stdin.nextInt();
						x=new ArrayList<Integer>();
						y=new ArrayList<Integer>();
						for(int j=0;j<nodeN;j++){
							x.add(stdin.nextInt());
							y.add(stdin.nextInt());
							
						}
						Vec v2=new Vec(x,y);
						//System.out.println(i+" "+v2);
						//??????
						v=init(v);
						v2=init(v2);
						check(v,v2,i,row);
						reverseVec(v2);
						v2=init(v2);
						check(v,v2,i,row);
						
						
					}
					
				}
				
				System.out.println("+++++");
				
				
			}
		}
	
	public static void main(String args[]){
		Main m =new Main();
		m.Solve();
	}
	
}

class Vec{
	ArrayList<Integer> x;
	ArrayList<Integer> y;
	public Vec(ArrayList<Integer> x,ArrayList<Integer>y){
		this.x=x;
		this.y=y;
		
	}
	public String toString(){
		return this.x.toString()+this.y.toString();
	}
}