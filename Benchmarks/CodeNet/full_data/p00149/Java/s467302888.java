import java.util.Scanner;
	class Main{

		public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
int x=0;
int left[]=new int[4];
int right[]=new int[4];
int hidari=0;
int migi=0;
	for(int i=1;x!=40;i++){
		migi=sc.nextInt();
		hidari=sc.nextInt();
		
		if(migi>=1.1){
			right[0]++;
		}else if(migi>=0.6){
			right[1]++;
		}else if(migi>=0.2){
			right[2]++;
		}else{
			right[3]++;
		}
		
		if(hidari>=1.1){
			left[0]++;
		}else if(hidari>=0.6){
			left[1]++;
		}else if(hidari>=0.2){
			left[2]++;
		}else{
			left[3]++;
		}
	
	}
	
	
	
	}
	}