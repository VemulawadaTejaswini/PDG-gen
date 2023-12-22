import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner in = new Scanner(System.in);

	int n,m;
	int[] A = new int[100];
	int[] C = new int[100];
	int[] P = new int[100];
	int[] F = new int[100];

	while(true)
	    {
		n = in.nextInt();
		m = in.nextInt();
		if(n == 0 && m == 0)break;
		for(int i=0;i<3;i++)
		{
		    int ph;
		    ph = in.nextInt();
		    for(int j=0;j<ph;j++)
			{
			    int in2;
			    in2 = in.nextInt();
			    F[in2] = i;
			}
		    
		}

		P[n] = 2;
		A[n] = F[n];
		C[n] = 2 - F[n];


		for(int i=n;i>1;i--)
		    {
			//P[i]ÌÈºÌ®ÍvZÌÊÅÄ«½àÌ
			//àµãÉQÂÌRbvª éÆ«
			//»êð½Î¤ÉÁÄ¢­ÉÍWñ®©·
			//RÂRbvª éÍQUñ
			//PÂÌÍQñ
			//Í¢A ÆÍvZ
			//habukuyo
			//iRbvªQÂÈãÌÉpÂ\j
			P[i-1] = 3*P[i] + 2;
			if(F[i-1] == 0)
			    {
				A[i-1]=A[i]; //à¤ùÉAÉ éÌÅ»êÜÅÌñiA[i]jðãüµÄI¹
				C[i-1]=C[i]+2*P[i]+2;//CÌ»êÜÅÌñ(C[i])Æ¡CÉ éRbvðAÉ®©µÄßµÄ­éñi2*P[i]jÆÚIÌJbvÌÚ®ñ(2)ðÁ¦½àÌðãü
			    }
			else if(F[i-1] == 1)
			    {
				//®©µ½¢Jbvª^ñÉ éêÅ
				//©ÂAÉàÁÄ¢«½¢ÉÍA
				//AÉ éàÌð·×ÄCÉÚ®³¹
				//ÚIÌJbvðAÉÚ®³¹I¹
				//CÉÚ®³¹½ÌÍAÉß³È¢
				//tà¯¶æ¤É·é
				A[i-1] = C[i] + P[i] + 1;
				C[i-1] = A[i] + P[i] + 1;
			    }
			else if(F[i-1] == 2)
			    {
				A[i-1] = A[i] + 2*P[i] + 2;
				C[i-1] = C[i];
			    }
			
			
		    }
	
		int ans = Math.min(A[1],C[1]);
		if(m < ans) System.out.println("-1");
		else System.out.println(ans);	
		
		
	}
	
	
	
    }
    
    
}