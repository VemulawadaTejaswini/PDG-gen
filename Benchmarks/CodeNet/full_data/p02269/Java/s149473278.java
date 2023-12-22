import java.util.*;
class  Main{
	Scanner sc= new Scanner(System.in);
	void aaaa(){
		int n=sc.nextInt();
		long[] dc=new long[n];
		int count=0;
		String YN="no";
		for(int i=0;i<n;i++){
			String gundam=sc.next();
			String nakami=sc.next();
			long st=0;
			for (int k=0;k<nakami.length();++k) { 
				switch (nakami.charAt(k)) { 
                    case 'A':st=st*10+1; 
                        break; 
                    case 'C':st=st*10+2; 
                        break; 
                    case 'G':st=st*10+3; 
                        break; 
                    case 'T':st=st*10+4; 
                        break; 
                } 
            } 
			if(gundam.equals("insert"))dc[count++]=st;
			else {
				for(int j=0;j<count;j++)if(dc[j]==st)YN="yes";
				System.out.println(YN);
			}
		}
	}
	public static void main(String[]args){
		new Main().aaaa();
	}
}