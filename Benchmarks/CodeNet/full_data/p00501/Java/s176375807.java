import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int count=0;
		boolean ok=false;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String old_board = new String();
		String tage_board=sc.next();
		char[] tage=new char[tage_board.length()+1];
		for(int i=0;i<tage_board.length();i++){
			tage[i]=tage_board.charAt(i);
		}
		for(int i=0;i<n;i++){
			int k=0,first=0,sa = -10,m=0,hit=0;
			old_board=sc.next();
			char[] old=new char[old_board.length()];
			for(int j=0;j<old_board.length();j++){
					old[j]=old_board.charAt(j);
			}
			ok=false;
			 while(k<old_board.length() ){//&& m<tage_board.length()	
				 
					if(old[k] == tage[m]){

						
						if(m==0){
							hit=k;
							m++;
							sa=k-first;
							first=k+1;
					
						}else if(m>0 && sa==k-first){
							sa=k-first;
							//k=k+sa-1;
							ok=true;
							//if(k>=old_board.length())ok=false;
							m++;
							sa=k-first;
							first=k+1;
					
						}else if(old[k]==old[k-1]){
							
						}else{
							if(k>old_board.length()){
								ok=false;
								k=hit;
								m=0;

							}

							sa=k-first;
							first=k+1;							
							
						}
					}

				k++;
			 }
			 if(ok)count++;
			
		}
		System.out.println(count);	
	}
}