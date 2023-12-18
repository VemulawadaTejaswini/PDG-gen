
import java.util.*;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int i,j,k;
    	long[][] ary = new long[n][3];
    	for(i=0;i<n;i++){
    		ary[i][0]=sc.nextLong();
    		ary[i][1]=sc.nextLong();
    		ary[i][2]=sc.nextLong();
    	}
 
    	long regm=0;
    	long a=1,b=1,c=1;
    	long reg=0;
    	long[] ary2 = new long[m];
    	
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	

    	a=1;
    	b=1;
    	c=-1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=1;
    	b=-1;
    	c=1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=1;
    	b=-1;
    	c=-1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=-1;
    	b=1;
    	c=1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=-1;
    	b=1;
    	c=-1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=-1;
    	b=-1;
    	c=1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	
    	

    	a=-1;
    	b=-1;
    	c=-1;
    	reg=0;
    	for(i=0;i<m;i++){
    		ary2[i]=0;
    	}
    	for(i=0;i<n;i++){
    		reg=a*ary[i][0]+b*ary[i][1]+c*ary[i][2];
    		for(j=0;j<m;j++){
    			if(j==m-1){
    				if(reg>=ary2[m-1]){
    				    for(k=0;k<j;k++){
    				        ary2[k]=ary2[k+1];
    				    }
    				    ary2[j]=reg;
    				}
    				break;
    			}else if(reg>=ary2[j] && reg<=ary2[j+1]){
    				for(k=0;k<j;k++){
    				    ary2[k]=ary2[k+1];
    				}
    				ary2[j]=reg;
    				break;
    			}
    		}
    	}
    	reg=0;
    	for(i=0;i<m;i++){
    		reg+=ary2[i];
    	}
    	if(reg>regm){
    		regm=reg;
    	}
    	System.out.println(regm);
    	
    }
}
