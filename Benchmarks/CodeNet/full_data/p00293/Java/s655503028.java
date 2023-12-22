import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	boolean[][] m=new boolean[24][60];
	int a=sc.nextInt();
	for(int i=0;i<a;i++){
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    m[x][y]=true;
	}
	a=sc.nextInt();
	for(int i=0;i<a;i++){
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    m[x][y]=true;
	}
        int s=0;
	for(int i=0;i<24;i++){
	    for(int j=0;j<60;j++){
		if(m[i][j]){
		    if(s!=0)System.out.print(" ");
		    System.out.print(i+":"+j/10+j%10);
		    s++;
		}
	    }
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}