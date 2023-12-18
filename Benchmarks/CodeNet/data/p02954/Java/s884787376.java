import java.util.*;
public class Main {

 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	char[] s = sc.nextLine().toCharArray();
	int[] r=new int[s.length];Arrays.fill(r,0);
	int rc=1,lc=0,rltmp=0; 
	for(int i=1;i<s.length;i++){
		if(s[i]=='R'){
			if(s[i-1]=='L'){//LR境目
				r[rltmp]=(int)Math.ceil(lc/2.0)+rc/2;//最初のL
				r[rltmp-1]=lc/2+(int)Math.ceil(rc/2.0);//最後のR
				rc=0;lc=0;
			}
			rc++;
		}else{
			if(s[i-1]=='R'){//ＲL境目
				rltmp=i;
			}
			lc++;
		}
	}
   	r[rltmp]=(int)Math.ceil(lc/2.0)+rc/2;//最初のL
	r[rltmp-1]=lc/2+(int)Math.ceil(rc/2.0);//最後のR
	
	for(int rr:r)System.out.print(rr+" ");
	System.out.println();
 }
}