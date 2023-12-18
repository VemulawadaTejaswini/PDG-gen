import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C [] = new int[4];
		String ans;
		for(int i=0; i<4;i++)
		{		
		C[i]=sc.nextInt();
		}
		if((C[2]==0&&C[3]!=0)||(C[2]==1&&((C[3]==0)||(C[3]==1)||(C[3]==2)))){			
			if((C[2]==0&&C[3]!=0)||(C[2]==1&&((C[3]==0)||(C[3]==1)||(C[3]==2)))){			
			ans="AMBIGUOUS";				
			}
			else{			
				ans="YYMM";	
			}	
		}
		else{			
			ans="NA";	
		}	
		System.out.println(ans);	
		}
	}