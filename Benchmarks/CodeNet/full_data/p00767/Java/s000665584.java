import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] h = new int[100000];
		int[] w = new int[100000];
		int[] t = new int[100000];
		int n = 0;
		int a =1;
		int k=0;
		suuzi[] p =new suuzi[150*150];
		int q =0;
		suuzi r ;
		suuzi b = new suuzi();
		System.out.println();
		for(int i=0;i<100000;i++){
			h[i]=sc.nextInt();
			w[i]=sc.nextInt();
			t[i]=h[i]*h[i]+w[i]*w[i];
			if(h[i]==0&&w[i]==0){
				n=i;
				break;
			}

		}
		for(int l=1;l<=150;l++){
			for(k=l+1;k<=150;k++){
				suuzi m = new suuzi();
				m.x=l;
				m.y=k;
				m.z=l*l+k*k;
				p[q]=m;
				q=q+1;
			}
		}
		q=q-1;
	   while(a==1){
		   a=0;
		   for(int i=0;i<q;i++){
			   if(p[i].z>p[i+1].z){
				   r=p[i];
				   p[i]=p[i+1];
				   p[i+1]=r;
				   a=1;
			   }
			   if(p[q].z==p[i+1].z&&p[i].x>p[i+1].x){
				   r=p[i];
				   p[i]=p[i+1];
				   p[i+1]=r;
				   a=1;
			   }
				   
		   }
	   }
		for(int i=0;i<n;i++){
			b.x =h[i];
			b.y =w[i];
				for(int l=0;l<q;l++){
					if(b.x==p[l].x&&b.y==p[l].y){
						System.out.println(p[l+1].x+" "+p[l+1].y);
					}
			}
		}
	}

}
class suuzi{
	int x;int y;int z;
}