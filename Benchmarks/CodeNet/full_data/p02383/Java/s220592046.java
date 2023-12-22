package main;

import java.util.*;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		class qube{
			int [] face = new int[5];
			int i,dump=0;
			String e;
			
			qube(){
				for(i=0;i<6;i++){
					face[i]=sc.nextInt();
				}
			}
			
			void swap(int a,int b){
				dump = this.face[a];
				this.face[a] = this.face[b];
				this.face[b] = dump;
				
			}
			
			void move(){
				if(this.e.equals("E")){
					swap(5,2);
					swap(2,0);
					swap(0,3);
					swap(2,5);
				}
				else if(this.e.equals("N")){
					
				}
				else if(this.e.equals("S")){
					
				}
				else{
					
				}
			}
			
		}
		
		qube q;
		
	}

}
