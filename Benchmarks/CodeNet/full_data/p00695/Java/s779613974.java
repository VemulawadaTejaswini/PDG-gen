import java.util.*;

public class Main{
    public static int map[][] = new int[5][5];

    static  int max;
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	for(int p=0 ; p<n ; p++){

	    for(int i=0 ; i<5 ; i++){
		for(int j=0 ; j<5 ; j++){
		    map[i][j]=sc.nextInt();
		}
	    }
	    
	    max=0;
	    for(int i=0 ; i<5 ; i++){
		for(int j=0 ; j<5 ; j++){
		    if(map[i][j]==0) continue;
		    search(i,j);
		   
		}
	    }
	    System.out.println(max);
	}
    }
    
    static void search(int x,int y){
	int f=0,s=0;
	int i=0,j=0,k=0,l=0;
	for(i=x ; i<5 ; i++){
	    for(j=y ; j<5 ; j++){
		f=1;
		for(k=x ; k<=i ; k++){
		    for(l=y ; l<=j ; l++){
			if(map[k][l]==0){
			    f=0;
			    break;
			}
 
		    }
		}
		if(f==1)max=Math.max(max,(k-x)*(l-y));
	    }
	}
    }

}