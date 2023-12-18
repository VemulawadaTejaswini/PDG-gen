import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int K=Integer.parseInt(str);
		int q,r,sum=0;
		
		for(int a=1;a<=K;a++){
			for(int b=1;b<=K;b++){
				for(int c=1;c<=K;c++){
					if(a==1||b==1||c==1){
						sum+=1;
					}else{
						if(a<b){
							q=a;
							a=b;
							b=q;
							if(a<c){
								q=a;
								a=c;
								b=q;
								if(b<c){
									q=b;
									b=c;
									c=q;
								}
							}else{
								if(b<c){
									q=b;
									b=c;
									c=q;
								}
							}
						}else{
							
							if(a<c){
								q=a;
								a=c;
								b=q;
								if(b<c){
									q=b;
									b=c;
									c=q;
								}
							}else{
								if(b<c){
									q=b;
									b=c;
									c=q;
								}
							}
						}
						while((r=a%b)!=0){
							a=b;
							b=r;
						}if(b<c){
							while((q=c%b)!=0){
								c=b;
								b=q;
							}sum=sum+b;
						}else{
							while((q=b%c)!=0){
								b=c;
								c=q;
							}sum=sum+c;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
