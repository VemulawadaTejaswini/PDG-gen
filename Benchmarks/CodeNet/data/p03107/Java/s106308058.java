import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		int N=s.length();
		String q="";
		String w="";
		int z=1,y=0,ans=N;
		boolean bool=true;
		while(N>2){
			while(z<N-1){
				while(z>0&&z+3<=N){
					if(s.substring(z,z+1).equals(s.substring(z+1,z+2))){
						break;
					}
					else{
						if(s.substring(z-1,z).equals(s.substring(z+2,z+3))){
							break;
						}
						else{
							q=s.substring(0,z);
							w=s.substring(z+2);
							s=q+w;
							y=1;
							N-=2;
						}
					}
					z--;
				}
				z++;
			}z=1;
			if(y==0)
				break;
			y=0;
		}z=0;
		while(z<N-1){
			if(s.substring(z,z+1).equals(s.substring(z+1,z+2))){
			
			}
			else{
				q=s.substring(0,z);
				w=s.substring(z+2);
				s=q+w;
				N-=2;
				z--;
			}
			z++;
		}
		System.out.println(ans-s.length());
	}

}