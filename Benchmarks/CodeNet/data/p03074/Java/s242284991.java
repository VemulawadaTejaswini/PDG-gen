import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int zero[]=new int[N/2+10];
		int one[]=new int[N/2+10];
		String S=stdIn.next();
		String h="";
		int z=0,y=0,x=0,ir=0,ir2=0,cou=0,max=0,w=0;
		while(z<N){
			if(S.substring(z,z+1).equals("0")){
				if(ir==1&&zero[0]!=0)
					x++;
				zero[x]++; ir=0;
			}
			else{
				if(ir==0&&one[0]!=0)
					y++;
				one[y]++; ir=1;
			}
			z++;
		}z=0;ir=0;
		while(z<K){
			h=S.substring(z,z+1);
			if(z==0&&ir==0){
				if(h.equals("0")){
					cou+=zero[z];
					cou+=one[z];
				}
				else{
					cou+=one[z];
					z--;
					ir=1;
				}
			}
			else{
				cou+=zero[z];
				cou+=one[z+ir];
			}
			z++;
		}max=cou;
		while(z<x||z<y){
			if(ir==0&&w==0){
				cou-=zero[w];
				cou+=zero[z];
				cou+=one[z];
			}
			else{
				cou-=zero[w];
				cou-=one[w];
				cou+=zero[z];
				cou+=one[z+ir];
			}
			if(max<cou)
				max=cou;
			z++;w++;
		}
		System.out.println(max);
	}
}