import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		
	int[][] men = new int[100][7];
	int[] meng = new int[7];
	int[] kari = new int[7];
	int ue;
	int yoko;
	int c = 0;
		
	Scanner scan = new Scanner(System.in);
	
	int kai = scan.nextInt();
	
	for(int i=1; i<=6; i++){
		meng[i] = scan.nextInt();}
	for(int q=1; q<kai; q++){
	for(int i=1; i<=6; i++){
		men[q][i] = scan.nextInt();}}
		
	ue = meng[1];
	yoko = meng[2];
	
	for(int q=1; q<kai; q++){
		for(int i=1; i<=6; i++){
			if(men[q][i]==ue){
				if(i==2){
					kari[1] = men[q][1];		kari[2] = men[q][2];
					kari[5] = men[q][5];		kari[6] = men[q][6];
			
					men[q][1] = kari[2];		men[q][2] = kari[6];
					men[q][6] = kari[5];		men[q][5] = kari[1];
				}
				else if(i==3){
					kari[1] = men[q][1];		kari[3] = men[q][3];
					kari[4] = men[q][4];		kari[6] = men[q][6];
			
					men[q][1] = kari[3];		men[q][3] = kari[6];
					men[q][4] = kari[1];		men[q][6] = kari[4];
				}
				else if(i==4){
					kari[1] = men[q][1];		kari[3] = men[q][3];
					kari[4] = men[q][4];		kari[6] = men[q][6];
			
					men[q][1] = kari[4];		men[q][3] = kari[1];
					men[q][4] = kari[6];		men[q][6] = kari[3];
				}
				else if(i==5){
					kari[1] = men[q][1];		kari[2] = men[q][2];
					kari[5] = men[q][5];		kari[6] = men[q][6];
			
					men[q][1] = kari[5];		men[q][2] = kari[1];
					men[q][6] = kari[2];		men[q][5] = kari[6];
				}
				else if(i==6){
					kari[1] = men[q][1];		kari[2] = men[q][2];
					kari[5] = men[q][5];		kari[6] = men[q][6];
			
					men[q][1] = kari[2];		men[q][2] = kari[6];
					men[q][6] = kari[5];		men[q][5] = kari[1];
					
					kari[1] = men[q][1];		kari[2] = men[q][2];
					kari[5] = men[q][5];		kari[6] = men[q][6];
			
					men[q][1] = kari[2];		men[q][2] = kari[6];
					men[q][6] = kari[5];		men[q][5] = kari[1];
				}
			}
		}
		
		for(int k=0; k<4; k++){
			if(men[q][2]==yoko){
				break;
			}
			
			kari[1] = men[q][1];		kari[2] = men[q][2];
			kari[5] = men[q][5];		kari[6] = men[q][6];
			
			men[q][1] = kari[2];		men[q][2] = kari[6];
			men[q][6] = kari[5];		men[q][5] = kari[1];
			
			kari[1] = men[q][1];		kari[3] = men[q][3];
			kari[4] = men[q][4];		kari[6] = men[q][6];
			
			men[q][1] = kari[4];		men[q][3] = kari[1];
			men[q][4] = kari[6];		men[q][6] = kari[3];
			
			kari[1] = men[q][1];		kari[2] = men[q][2];
			kari[5] = men[q][5];		kari[6] = men[q][6];
			
			men[q][1] = kari[5];		men[q][2] = kari[1];
			men[q][6] = kari[2];		men[q][5] = kari[6];
		}
		
		for(int i=1; i<=6; i++){
			if(meng[i]!=men[q][i]){
				c++;
				break;
			}
		}
	}
			
		if(c+1==kai){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
