import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	 
	        while(true){
	        	int [] p =new int[5];
	        	p[0]=scan.nextInt();
	        	if(p[0]==0)break;
	        	for(int i=1;i<5;i++)p[i]=scan.nextInt();
	        	
	        	int g=0;
	        	int c =0;
	        	int pe =0;
	        	for(int i=0;i<5;i++){
	        		switch(p[i]){
	        		case 1:g++;
	        			break;
	        		case 2:c++;
	        			break;
	        		case 3:pe++;
	        			break;
	        		}
	        	}
	        	if(g==5||c==5||pe==5)
	        		for(int i=0;i<5;i++)
	        		System.out.println(3);
	        	else if(g>0&&c>0&&pe>0)
	        		for(int i=0;i<5;i++)
	        			System.out.println(3);
	        	else if(g==0&&c>pe){
	        		for(int i=0;i<5;i++){
	        			if(p[i]==2)System.out.println(1);
	        			else System.out.println(2);
	        		}
	        	}
	        	else if(g==0){
	        		for(int i=0;i<5;i++){
	        			if(p[i]==2)System.out.println(1);
	        			else System.out.println(2);
	        		}
	        	}
	        	else if(c==0){
	        		for(int i=0;i<5;i++){
	        			if(p[i]==3)System.out.println(1);
	        			else System.out.println(2);
	        		}
	        	}
	        	else if(pe==0){
	        		for(int i=0;i<5;i++){
	        			if(p[i]==1)System.out.println(1);
	        			else System.out.println(2);
	        		}
	        	}
	
	        		
	        	}
	        }
	     
}
	    