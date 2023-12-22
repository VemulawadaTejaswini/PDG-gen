import java.util.*; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		boolean cards[][]=new boolean[4][13];
		char simbol[]={'S','H','C','D'};
		
		for(int i=0;i<n;i++){
			String c=cin.nextLine();
			int x=cin.nextInt();
			if(c=="S")cards[0][x]=true;
			if(c=="H")cards[1][x]=true;
			if(c=="C")cards[2][x]=true;
			if(c=="D")cards[3][x]=true;
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<13;j++){
				if(!cards[i][j])System.out.println(simbol[i]+" "+j+1);
			}
		}
	}

}

