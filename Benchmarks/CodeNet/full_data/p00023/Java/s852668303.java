import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s,u;
		String[] a;
		double xa,ya,ra,xb,yb,rb,x,y,l1,l2;
		double l;
		int ans=0;
		int t;
		try{
				while((s=r.readLine()) !=null){
						t=Integer.parseInt(s);
						for(int i=0;i<t;i++){
							u=r.readLine();
							a=u.split(" ");
							double[] b=new double[a.length];
							for(int j=0;j<a.length;j++){
								b[j]=Double.parseDouble(a[j]);
							}
							xa=b[0];
							ya=b[1];
							ra=b[2];
							xb=b[3];
							yb=b[4];
							rb=b[5];
							if(xa>xb){
								x=xa-xb;
							}else{
								x=xb-xa;
							}
							if(ya>yb){
								y=ya-yb;
							}else{
								y=yb-ya;
							}
							l=Math.sqrt(x*x+y*y);
							l1=ra+rb;
							if(ra>rb){
								l2=ra-rb;
							}else{
								l2=rb-ra;
							}
							if(l<l2){
								ans=2;
								if(rb>ra){
									ans *=-1;
								}
							}else{ 
								if(l2<=l &&l<=l1){
										ans=1;
							    }else{
										ans=0;
							    }
							}
							System.out.println(ans);
						}
				}
		}catch(IOException e){
				System.out.println(e);
		}
	}
}