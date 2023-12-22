import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
		//new AOJ0578().run();
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int n=sc.nextInt();
			int count=0;
			char name[]=sc.next().toCharArray();
			char old[][]=new char[n][];
			//テ」ツ??」ツ??・ツ青催・ツ可催」ツ?古ヲツ?敕」ツ??ヲツオツョテ」ツ?凝」ツ?ーテ」ツ?ェテ」ツ?凝」ツ?」テ」ツ?淌」ツ??
			//temp[i]テ」ツ?ッテ」ツ?、テ」ツ?湘」ツつ甘」ツ?淌」ツ??ァツ慊凝ヲツ敖ソテ」ツ?ョiテヲツ鳴?・ツュツ療ァツ崢ョテ」ツ?経ldテ」ツ?ョテ、ツスツ陛ヲツ鳴?・ツュツ療ァツ崢ョテ」ツ?ォテ」ツ?づ」ツ?」テ」ツ?淌」ツ?凝」ツつ津・ツ?・テ」ツつ古」ツ?ヲテ」ツ?甘」ツ??
			int temp[]=new int[name.length];
			for(int i=0; i<n; i++){
				old[i]=sc.next().toCharArray();
			}
			
			for(int i=0; i<n; i++){
				for(int j=0; j<old[i].length; j++){
					if(name[0]==old[i][j]){
						//テ」ツ?ェテ」ツつ禿」ツ?凝ゥツ鳴「テヲツ閉ーテ」ツつ津・ツ堕シテ」ツ?カ
						if(signBord(name, old[i], j, 0, temp)){
							//System.out.println(i+" "+String.valueOf(old[i]));
							count++;
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	
	boolean signBord(char name[],char old[],int k,int d, int temp[]){
		temp[d]=k;
		if(name.length-1 <= d){
			for(int i=0; i+2<name.length; i++){
				if(temp[i+1]-temp[i] != temp[i+2]-temp[i+1]){
						return false;
				}
			}
			return true;
		}
		for(int j=k+1; j<old.length; j++){
			if(name[d+1]==old[j]){
				if(signBord(name, old, j, d+1, temp)){
					return true;
				}
			}
		}
		return false;
	}

}