import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
		int y=sc.nextInt();
  		int[] a=new int[n-1];
  		int e=0;
  		int m=0;
  
  		for(int c=1;c<=n;c++){
        for(int d=c+1;d<=n;d++){
        	if(c<=x&&y<=d){
            	a[(d-y)+1+(x-c)-1]++;
            }else if(c<=x&&d<=x){
            	a[d-c-1]++;
            }else if(c<=x&&x<d){
            	 e=(x-c)+1+(y-d);
               m=Math.min(e,(d-c));
              a[m-1]++;
            }else if(c>=y&&d>=y){
            	a[d-c-1]++;
            }else if(c>x&&d<=y){
            	e=(c-x)+1+(y-d);
                m=Math.min(e,(d-c));
              	a[m-1]++;
            }else{
            	e=(c-x)+1+(d-y);
                m=Math.min(e,(d-c));
              	a[m-1]++;
            }
        }
        }

  
  		for(int ans:a){
        System.out.println(ans);
        }
    }
}
