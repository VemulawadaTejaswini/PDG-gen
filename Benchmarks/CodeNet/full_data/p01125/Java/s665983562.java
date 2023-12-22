import java.util.*;

class Main{
    static int[][] gems;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){
	    int count = 0;
	    gems = new int[n][2];

	    for(int i=0; i<n; i++){
		gems[i][0] = sc.nextInt();
		gems[i][1] = sc.nextInt();
	    }

	    int m = sc.nextInt();

	    int posX = 10;
	    int posY = 10;
	    for(int i=0; i<m; i++){
		String houi = sc.next();
		int go = sc.nextInt();
		
		for(int k=1; k<=go; k++){ 
		    if(houi.equals("N")){
			posY = posY + 1;
		    }else if(houi.equals("E")){
			posX = posX + 1;
		    }else if(houi.equals("S")){
			posY = posY - 1;
		    }else if(houi.equals("W")){
			posX  = posX - 1;
		    }
		    for(int j=0; j<n; j++){
			if(posX==gems[j][0] && posY==gems[j][1]){
			    count++;
			    gems[j][0]=-1;
			    gems[j][1]=-1;
			}
		    }
		}
	    }
	    
	    String ans = "";
	    if(count==n){ans = "Yes";}
	    else {ans = "No";}

	    System.out.println(ans);

	    n = sc.nextInt();
	}
    }
}