import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		//System.out.println(Integer.toBinaryString(4));
		while(sca.hasNext()){
			int n=sca.nextInt();
			int ai[]=new int[n+1];
			for(int i=1;i<=n;i++){
				ai[i]=sca.nextInt();
			}
			String be="00000000000000000000000";
			int of=0;
			int st=1;
			int sum=0;
			for(int i=1;i<=n;i++){
				String t=Integer.toBinaryString(ai[i]);
				int l=be.length()-1;
				int r=t.length()-1;
				while(l>=0&&r>=0){
					if(be.charAt(l)=='1'&&t.charAt(r)=='1'){
						while(true){
						of-=ai[st];
						st++;
						be=Integer.toBinaryString(of);
						 l=be.length()-1;
						 r=t.length()-1;
						 int flag=0;
						 while(l>=0&&r>=0){
							 if(be.charAt(l)=='1'&&t.charAt(r)=='1'){
								 flag=1;
								 break;
							 }
							 l--;
							 r--;
						 }
						 if(flag==0)break;
						}
						break;
					}
					l--;
					r--;
				}
				of+=ai[i];
				be=Integer.toBinaryString(of);
				sum+=(i-st+1);
			}
			System.out.println(sum);
			
		}
	}

}
