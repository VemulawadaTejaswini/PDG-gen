
public class Main{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        boolean b[][]=new boolean[3][3];
        
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        int n=sc.nextInt();	
        for(int k=0;k<n;k++) {
        	int x=sc.nextInt();
        	for(int i=0;i<3;i++) {
        		for(int j=0;j<3;j++) {
        			if(x==a[i][j]) {
        				b[i][j]=true;
        			}
        		}
        	}
        		
        }
        
       boolean y=false;
       if(y==false) {
    	   if((b[0][0]==true&&b[1][1]==true&&b[2][2]==true)
    			   ||(b[0][2]==true&&b[1][1]==true&&b[2][0]==true)) {
    		  y=true; 
    	   }
       }else {
         for(int i=0;i<3;i++) {
        	if(b[0][i]==true&b[1][i]==true&b[2][i]==true) {
        		y=true;
        		break;
        	}
        
         }
         for(int j=0;j<3;j++) {
            if(b[j][0]==true&b[j][1]==true&b[j][2]==true) {
            	y=true;
            	break;
            }
            
         }
       }
       
       if(y==true) {
    	   System.out.print("Yes");
       }else {
    	   System.out.print("No");
       }
	}

}
