import java.util.*;
public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	int[] one = new int[10];
    	int[] two = new int[10];
    	int[] the = new int[10];
    	int[] fou = new int[10];
    	int[] fiv = new int[10];
    	int reg2,sumpoint;
    	for(;;){
    		sumpoint=0;
    		Arrays.fill(one, 0);
    		Arrays.fill(two, 0);
    		Arrays.fill(the, 0);
    		Arrays.fill(fou, 0);
    		Arrays.fill(fiv, 0);
    		
    		int n=sc.nextInt();
    		if(n==0){
    			return;
    		}
    		
    		for(int i=0;i<n;i++){
    			one[9-i]=sc.nextInt();
    			two[9-i]=sc.nextInt();
    			the[9-i]=sc.nextInt();
    			fou[9-i]=sc.nextInt();
    			fiv[9-i]=sc.nextInt();
    		}
    		shift(one);
			shift(two);
			shift(the);
			shift(fou);
			shift(fiv);
    		for(;;){
    			reg2=check(one,two,the,fou,fiv);
    			if(reg2>0){
    				shift(one);
    				shift(two);
    				shift(the);
    				shift(fou);
    				shift(fiv);
    				
    				sumpoint+=reg2;
    			}else{
    				System.out.println(sumpoint);
    				break;
    			}
    		}
    		
    	}
    	
    }
    static int check(int[] one,int[] two,int[] the,int[] fou,int[] fiv){
    	int point;
    	int reg;
    	int sum=0;
    	
    	for(int i=0;i<10;i++){
    		point=0;
    		reg=0;
    		if(two[i]==the[i]&&fou[i]==the[i]){
    			point=3;
    			if(one[i]==the[i]){
    				point++;
    				reg+=1;
    			}
    			if(fiv[i]==the[i]){
    				point++;
    				reg+=2;
    			}
    			
    			if(reg==0){
    				point*=the[i];
    				two[i]=0;
    				the[i]=0;
    				fou[i]=0;
    			}else if(reg==1){
    				point*=the[i];
    				one[i]=0;
    				two[i]=0;
    				the[i]=0;
   					fou[i]=0;
    			}else if(reg==2){
    				point*=the[i];
    				two[i]=0;
    				the[i]=0;
				    fou[i]=0;
				    fiv[i]=0;
    			}else if(reg==3){
    				point*=the[i];
    				one[i]=0;;
    				two[i]=0;;
    				the[i]=0;;
				    fou[i]=0;;
				    fiv[i]=0;
    			}
    		}else if(two[i]==the[i]){
    			if(one[i]==the[i]){
    				point=3*the[i];
    				one[i]=0;
    				two[i]=0;
    				the[i]=0;
    			}
    		}else if(fou[i]==the[i]){
    			if(fiv[i]==the[i]){
    				point=3*the[i];
    				the[i]=0;
    			    fou[i]=0;
 				    fiv[i]=0;
    			}
    		}
    	sum+=point;
    	}
    	return sum;
    }
    static void shift(int[] list){
    	for(int i=1;i<10;i++){
    		int j=0;
            while(i-j-1>=0&&list[i-j-1]==0){
            	j++;
            }
            if(j!=0){
                list[i-j]=list[i];
                list[i]=0;
            }
    	}
    }
}

