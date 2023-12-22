import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br
		= new BufferedReader(new InputStreamReader(System.in));
		while(true){

			String buf;
			if((buf=br.readLine())==null)break;
			if(buf.length()==0)break;
			String[] buf2=buf.split(" ");
			double[] data=new double[buf2.length];
			for(int i=0;i<data.length;i++){
				data[i]=Double.parseDouble(buf2[i]);
			}
			boolean bool=true;
			if(bool){
				if(suppose(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7])){
					System.out.println("YES");
				}else{
					System.out.println("NO");
					bool=false;
				}
			}
		}
	}
	private static boolean suppose(double x1,double y1,double x2,double y2,double x3,double y3,double xp,double yp){
		double ABxAP=( (x2-x1)*(yp-y1) ) - ( (y2-y1)*(xp-x1) );
		if(ABxAP<0.0001 && ABxAP>-0.0001)ABxAP=0;
		double BCxBP=( (x3-x2)*(yp-y2) ) - ( (y3-y2)*(xp-x2) );
		if(BCxBP<0.0001 && BCxBP>-0.0001)ABxAP=0;

		double CAxCP=( (x1-x3)*(yp-y3) ) - ( (y1-y3)*(xp-x3) );
		if(CAxCP<0.0001 && CAxCP>-0.0001)ABxAP=0;

		if((ABxAP>0 && BCxBP>0 && CAxCP>0)|| (ABxAP<0 && BCxBP<0 && CAxCP<0))
			return true;
		return false;
	}
}