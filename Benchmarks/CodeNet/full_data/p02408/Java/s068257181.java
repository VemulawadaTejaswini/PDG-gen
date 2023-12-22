import java.io.*;

class Main{

    public static void main(String[] args)throws IOException{
	final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int[][] card=new int[4][];
	for(int i=0;i<4;i++) card[i]=new int[13];
	for(int i=0;i<4;i++){
	    for(int j=0;j<13;j++){
		card[i][j]=0;
	    }
	}
	
	
	String str=br.readLine();
	int n=Integer.parseInt(str);
	for(int i=0;i<n;i++){
	    String[] st=br.readLine().split(" ");
	    String mark=st[0];
	    int num=Integer.parseInt(st[1]);
	    if(mark.equals("S")) card[0][num-1]++;
	    else if(mark.equals("H")) card[1][num-1]++;
	    else if(mark.equals("C")) card[2][num-1]++;	
	    else if(mark.equals("D")) card[3][num-1]++;
	}
	for(int i=0;i<4;i++){
	    for(int j=0;j<13;j++){
		if(card[i][j]==0){
		    if(i==0) System.out.println("S " + (j+1));
		    else if(i==1) System.out.println("H " + (j+1));
		    else if(i==2) System.out.println("C " + (j+1));
		    else if(i==3) System.out.println("D " + (j+1));
		}
	    }
	}
    }
}
    