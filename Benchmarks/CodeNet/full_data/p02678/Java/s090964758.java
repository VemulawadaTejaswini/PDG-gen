//20200517 D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[m];
		int[] b=new int[m];
		int[] c=new int[n+1];
      	boolean[] t=new boolean[n+1];
      	int s=1;
      	t[1]=true;
		for(int i=0;i<m;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		while(s<n){
			for(int i=0;i<m;i++){
					if(t[a[i]]&&!t[b[i]]){
						c[b[i]]=a[i];	
						a[i]=0;
						b[i]=0;
                      	//System.out.println(111);
			
					}
					if(t[b[i]]&&!t[a[i]]){
						c[a[i]]=b[i];
						a[i]=0;
						b[i]=0;
                      	//System.out.println(222);
			
					}
			}
          	for(int i=2;i<n+1;i++){
              	if(c[i]!=0&&!t[i]){
                	t[i]=true;
                  	s++;
                }
			}
          	for(int i=2;i<n+1;i++){
			//System.out.println(c[i]);
			}
		}
		if(true){
			System.out.println("Yes");
          for(int i=2;i<n+1;i++){
			System.out.println(c[i]);
		  }
		}else{
			System.out.println("No");
		}
		
	}
}
