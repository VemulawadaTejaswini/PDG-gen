import java.util.Scanner;

public class Main {

	Scanner sc;
	
	int binarySearch(int[][] array,int num,int s,int g){
		if(s==g){
			return array[s][2];
		}
		else{
			if(array[(s+g)/2][0]<=num){
				return binarySearch(array,num,s,(s+g)/2);
			}
			else{
				return binarySearch(array,num,(s+g)/2+1,g);
			}
		}
	}
	
	void makeRank(int[][] array,int n){
		int score=array[0][1];
		int rank=1;
		for(int i=0;i<n;++i){
			if(score>array[i][1]){
				++rank;
			}
			array[i][2]=rank;
		}
	}
	
	void swap(int[][] array,int i,int j){
		int[] temp=new int[3];
		for(int k=0;k<3;++k){
			temp[k]=array[i][k];
			array[i][k]=array[j][k];
			array[j][k]=temp[k];
		}
	}

	void sort(int[][] array,int s,int g,int index,boolean greater){
		int med=array[s][index];
		int i=s,j=g;
		while(i<j){
			for(;greater?array[i][index]>med:array[i][index]<med;++i);
			for(;greater?array[j][index]<med:array[j][index]>med;--j);
			if(i<=j){
				swap(array,i,j);
				++i;--j;
			}
		}
		
		if(i-j==2)++j;
		if(s<j){
			sort(array,s,j,index,greater);
		}
		if(i<g){
			sort(array,i,g,index,greater);
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		int[][] team=new int[100][3];
		sc=new Scanner(System.in).useDelimiter(",|\n|\r\n");
		int n=0;
		while(true){
			int num=ni(),score=ni();
			if(num==0&&score==0)break;
			team[n][0]=num;
			team[n][1]=score;
			++n;
		}

		sort(team,0,n-1,1,true);
		
		makeRank(team,n);
		sort(team,0,n-1,0,false);

		while(sc.hasNext()){
			int num=ni();
			System.out.println(binarySearch(team,num,0,n-1));
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

}