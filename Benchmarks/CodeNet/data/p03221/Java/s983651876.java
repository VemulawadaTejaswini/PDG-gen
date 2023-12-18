import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Pi[]=new int[M];
		int Yi[]=new int[M];
		int sort[]=new int[N+1];
		for(int i=0;i<M;i++){
			Pi[i]=sc.nextInt();
			Yi[i]=sc.nextInt();
			++sort[Pi[i]];
		}
		
		for(int i=1;i<N+1;i++){			
			int[] tmp=new int[sort[i]];
			for(int j=0,k=0;j<M;j++){
				if(Pi[j]==i){
					tmp[k]=Yi[j];
					k++;
				}
			}
			int t;
			for(int a=0;a<tmp.length;a++){
				for(int b=0;b<tmp.length-1-a;b++){
					if(tmp[b]>tmp[b+1]){
						t=tmp[b];
						tmp[b]=tmp[b+1];
						tmp[b+1]=t;					
					}
				}				
			}
			for(int c=0;c<M;c++){
				for(int a=0;a<tmp.length;a++){
					if(Pi[c]==i){
						if(Yi[c]==tmp[a]){
							Yi[c]=a+1;
						}
					}
				}
			}			
		}
				
		for(int i=0;i<M;i++){
			String str =String.format("%06d%06d", Pi[i],Yi[i]);     
			System.out.println(str);
		}		
		sc.close();
	}
}