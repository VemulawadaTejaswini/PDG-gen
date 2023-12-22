import java.io.*;
import java.util.*;

public class Main{
	//all of made is 0
	static int[][][][][][][] step=new int[8][8][8][8][8][8][8];
	public static void main(String[] args){
		//make variable
		int count=1;
		int[] temp01={0,1,2,3,4,5,6,7};
		ArrayList<int[]> thinking=new ArrayList<int[]>();
		ArrayList<int[]> nextThink=new ArrayList<int[]>();
		
		//Starting Set
		step[0][1][2][3][4][5][6]=-1;
		thinking.add(temp01);
		while(thinking.size()!=0){
			for(int i=0;i<thinking.size();i++){
				//thinking.ver--i
				int[] temp02=thinking.get(i);
				//concering Data Set
				int[] tempThinkA=new int[8];
				for(int j=0;j<8;j++){
					tempThinkA[j]=temp02[j];
				}
				int indexZero=listIndex(0,tempThinkA);
				//UpDown
				if(indexZero<4){
					int[] tempNextThink=tempThinkA;
					int temp=tempThinkA[indexZero+4];
					tempNextThink[indexZero]=temp;
					tempNextThink[indexZero+4]=0;
					if(makeStep(count,tempNextThink)){
						nextThink.add(tempNextThink);
					}
				}
				else{
					int[] tempNextThink=tempThinkA;
					int temp=tempThinkA[indexZero-4];
					tempNextThink[indexZero]=temp;
					tempNextThink[indexZero-4]=0;
					if(makeStep(count,tempNextThink)){
						nextThink.add(tempNextThink);
					}
				}
				//Left
				//concering Data Set
				int[] tempThinkB=new int[8];
				for(int j=0;j<8;j++){
					tempThinkB[j]=temp02[j];
				}
				if(indexZero%4!=0){
					int[] tempNextThink=tempThinkB;
					int temp=tempThinkB[indexZero-1];
					tempNextThink[indexZero]=temp;
					tempNextThink[indexZero-1]=0;
					if(makeStep(count,tempNextThink)){
						nextThink.add(tempNextThink);
					}
				}
				//Right
				//concering Data Set
				int[] tempThinkC=new int[8];
				for(int j=0;j<8;j++){
					tempThinkC[j]=temp02[j];
				}
				if(indexZero%4!=3){
					int[] tempNextThink=tempThinkC;
					int temp=tempThinkC[indexZero+1];
					tempNextThink[indexZero]=temp;
					tempNextThink[indexZero+1]=0;
					if(makeStep(count,tempNextThink)){
						nextThink.add(tempNextThink);
					}
				}
			}
			count++;
			//Search
			/*
			System.out.println("a-a");
			for(int i=0;i<thinking.size();i++){
				readList(thinking.get(i));
			}
			System.out.println("a-b");
			for(int i=0;i<nextThink.size();i++){
				readList(nextThink.get(i));
			}
			*/
			thinking=nextThink;
			nextThink=new ArrayList<int[]>();
			/*
			System.out.println("b-a");
			for(int i=0;i<thinking.size();i++){
				readList(thinking.get(i));
			}
			System.out.println("b-b");
			for(int i=0;i<nextThink.size();i++){
				readList(nextThink.get(i));
			}
			*/
		}
		
		//finish
		step[0][1][2][3][4][5][6]=0;
		
		//input
		Scanner scan=new Scanner(System.in);
		while(true){
			try{
				int[] n=new int[8];
				for(int i=0;i<8;i++){
					n[i]=scan.nextInt();
				}
				System.out.println(readStep(n));
			}
			catch(Exception e){
				break;
			}
		}
	}
	static int readStep(int[] a){
		return step[a[0]][a[1]][a[2]][a[3]][a[4]][a[5]][a[6]];
	}
	static boolean makeStep(int num, int[] data){
		if(step[data[0]][data[1]][data[2]][data[3]][data[4]][data[5]][data[6]]==0){
			step[data[0]][data[1]][data[2]][data[3]][data[4]][data[5]][data[6]]=num;
			return true;
		}
		else{
			return false;
		}
	}
	static int listIndex(int num,int[] data){
		int ans=-1;
		for(int i=0;i<8;i++){
			if(data[i]==num){
				ans=i;
				break;
			}
		}
		return ans;
	}
	static void readList(int[] data){
		for(int i=0;i<8;i++){
			System.out.print(data[i]+" ");
			if(i==3 || i==7){
				System.out.println();
			}
		}
		System.out.println();
	}
}