import java.io.*;

public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main ( String [] args ) throws IOException


    {
    	
	new Main().cal();
    }

 
    private void cal() throws IOException 
    {
    	while(true){
	    String[] buffer=br.readLine().split("\\s");
    	
	    int height=Integer.parseInt(buffer[0]);


	    int width=Integer.parseInt(buffer[1]);
	    int objectColor = Integer.parseInt(buffer[2]);
	    int[][] arr=new int[height][width];
	    int max=0;
    		
	    if(height==0 && width==0 && objectColor==0)
	    	break;
    		
	    for(int i=0;i<height;i++){
	    	String[] temp=br.readLine().split("\\s");
	    	for(int j=0;j<width;j++)
	    		arr[i][j]=Integer.parseInt(temp[j]);
	    	}
    		
	    for(int i=1;i<7;i++)
		for(int j=1;j<7;j++)
		    for(int k=1;k<7;k++)
			for(int m=1;m<7;m++){
			    int temp=checkColor(0,0,change(arr,m,k,j,i,objectColor),objectColor);
						
	    					if(max<temp){
	    						max=temp;
							/*		for(int z=0;z<height;z++){
							    for(int x=0;x<width;x++)
								System.out.print(change(arr,m,k,j,i,objectColor)[z][x]+" ");
								System.out.println("");		    }			System.out.println("max : "+max);
						*/	
						}}
	    
	    System.out.println(max);
    	}

    	
    }
    public int[][] change(int[][] arr,int m,int k,int j,int i,int Color){


    	int[][]tempArr=(int[][]) clone(arr);
	int initial=tempArr[0][0];

	changeCell(tempArr,0,0,m,initial);

	for(int x=0;x<arr.length;x++)
	    for(int y=0;y<arr[0].length;y++)
		if(tempArr[x][y]==0)
		    tempArr[x][y]=m;

     	changeCell(tempArr,0,0,k,m);
	for(int x=0;x<arr.length;x++)
	    for(int y=0;y<arr[0].length;y++)
		if(tempArr[x][y]==0)
		    tempArr[x][y]=k;

    	changeCell(tempArr,0,0,j,k); 
	for(int x=0;x<arr.length;x++)
	    for(int y=0;y<arr[0].length;y++)
		if(tempArr[x][y]==0)
		    tempArr[x][y]=j;

    	changeCell(tempArr,0,0,i,j);
 
	for(int x=0;x<arr.length;x++)
	    for(int y=0;y<arr[0].length;y++)
		if(tempArr[x][y]==0)
		    tempArr[x][y]=i;

    	changeCell(tempArr,0,0,Color,i);

	for(int x=0;x<arr.length;x++)
	    for(int y=0;y<arr[0].length;y++)
		if(tempArr[x][y]==0)
		    tempArr[x][y]=Color;

    	return tempArr; 
    }
    
    public static Object[] clone(int[][] arr){
    		if(arr==null)
    				return null;
    		else {
		    int[][] temp=new int[arr.length][arr[0].length];
		    for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[0].length;j++)
			    temp[i][j]=arr[i][j];
		    
    				return temp;
		}
    }
    
    public int checkColor(int a,int b,int[][] checkingArr,int Color){
    	
    		if(a>=0 && b>=0 &&a<checkingArr.length&& b<checkingArr[0].length&&checkingArr[a][b]==Color){
		    checkingArr[a][b]=0;
		    return 1+
checkColor(a-1,b,checkingArr,Color)+checkColor(a+1,b,checkingArr,Color)+
checkColor(a,b-1,checkingArr,Color)+checkColor(a,b+1,checkingArr,Color);
    		}
    		else 
    				return 0;
    }
    
    public void changeCell(int[][] tempArr,int a, int b,int c,int d){

    	tempArr[a][b]=0;
    	
    	if(a>0 && tempArr[a-1][b]==d)
    		changeCell(tempArr,a-1,b,c,d);
    	if(b>0 && tempArr[a][b-1]==d)
    		changeCell(tempArr,a,b-1,c,d);
    	if(a<tempArr.length-1 && tempArr[a+1][b]==d)
    		changeCell(tempArr,a+1,b,c,d);
    	if(b<tempArr[0].length-1 && tempArr[a][b+1]==d)
    		changeCell(tempArr,a,b+1,c,d);
	


    	
    }

    
    
}