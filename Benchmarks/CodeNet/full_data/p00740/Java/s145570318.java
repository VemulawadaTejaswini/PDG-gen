package mayerQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args)throws IOException{
		int count;
		int n,p;//?????°????°????
		int i,j;
		int wan;
		int k=0;
		List<Human> list=new ArrayList<Human>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			count=0;
			list.clear();
			wan=0;
			k=0;
			
			String str=br.readLine();
			String[] a=str.split(" ");
			n=Integer.parseInt(a[0]);
			p=Integer.parseInt(a[1]);
			if(n==0&&p==0){
				break;
			}
			for(i=0;i<n;i++){
				Human e=new Human();
				list.add(i,e);
			}
			wan=p;
			
			while(true){
				if(wan>0){
					list.get(k).setStone(list.get(k).getStone()+1);
					wan--;
				}else if(wan==0){
					wan=list.get(k).getStone();
					list.get(k).setStone(0);
				}
				if(list.get(k).getStone()==p){
					System.out.println(k);
					break;
				}
				if(k<n-1){
					k++;
				}else{
					k=0;
				}
			}
		}
	}
	
}

class Human{
	int stone=0;

	public int getStone() {
		return stone;
	}

	public void setStone(int stone) {
		this.stone = stone;
	}
	
}