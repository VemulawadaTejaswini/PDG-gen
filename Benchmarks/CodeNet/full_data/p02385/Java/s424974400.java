import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		
	int[] men = new int[7];
	int[] meng = new int[7];
	int[] kari = new int[7];
	int ue;
	int yoko;
	int c = 0;
		
	Scanner scan = new Scanner(System.in);
	
	for(int i=1; i<=6; i++){
		meng[i] = scan.nextInt();}
	for(int i=1; i<=6; i++){
		men[i] = scan.nextInt();}
		
	ue = meng[1];
	yoko = meng[2];
		
		for(int i=1; i<=6; i++){
			if(men[i]==ue){
				if(i==2){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
				}
				else if(i==3){
					kari[1] = men[1];		kari[3] = men[3];
					kari[4] = men[4];		kari[6] = men[6];
			
					men[1] = kari[3];		men[3] = kari[6];
					men[4] = kari[1];		men[6] = kari[4];
				}
				else if(i==4){
					kari[1] = men[1];		kari[3] = men[3];
					kari[4] = men[4];		kari[6] = men[6];
			
					men[1] = kari[4];		men[3] = kari[1];
					men[4] = kari[6];		men[6] = kari[3];
				}
				else if(i==5){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[5];		men[2] = kari[1];
					men[6] = kari[2];		men[5] = kari[6];
				}
				else if(i==6){
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
					
					kari[1] = men[1];		kari[2] = men[2];
					kari[5] = men[5];		kari[6] = men[6];
			
					men[1] = kari[2];		men[2] = kari[6];
					men[6] = kari[5];		men[5] = kari[1];
				}
			}
		}
		
		for(int q=0; q<4; q++){
			if(men[2]==yoko){
				break;
			}
			
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[2];		men[2] = kari[6];
			men[6] = kari[5];		men[5] = kari[1];
			
			kari[1] = men[1];		kari[3] = men[3];
			kari[4] = men[4];		kari[6] = men[6];
			
			men[1] = kari[4];		men[3] = kari[1];
			men[4] = kari[6];		men[6] = kari[3];
			
			kari[1] = men[1];		kari[2] = men[2];
			kari[5] = men[5];		kari[6] = men[6];
			
			men[1] = kari[5];		men[2] = kari[1];
			men[6] = kari[2];		men[5] = kari[6];
		}
		
		for(int i=1; i<=6; i++){
			if(meng[i]!=men[i]){
				c = 1;
				break;
			}
		}
			
		if(c==0){
			System.out.println("Yes");
		}
		else if(c==1){
			System.out.println("No");
		}
	}
}
