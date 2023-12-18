import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int C [] = new int[200];
		String ans;
		for(int i=0; i<4;i++)
		{		
		C[i]=sc.nextInt();
		}
		if((C[2]==0&&C[3]==0)||(C[2]==1&&(C[3]!=0)&&(C[3]!=1)&&(C[3]!=2))){			
			if((C[0]==0&&C[1]==0)||(C[0]==1&&(C[1]!=0)&&(C[1]!=1)&&(C[1]!=2))){			
			ans="NA";				
			}
			else{			
				ans="MMYY";	
			}	
		}
		else{			
			ans="AMBIGUOUS";	
		}	
		System.out.println(ans);	
		}
	}
