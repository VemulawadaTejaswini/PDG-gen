import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	 private enum pType{
	    	p1(1),
	    	p2(2),
	    	p3(3),
	    	pInfinity(0);

		 	private int p;
		 	private pType(int p){
		 		this.p = p;
		 	}
		 	private int getPType(){
		 		return p;
		 	}
	    }

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = convertStringToInt(br.readLine().split(" "));
        int[] y = convertStringToInt(br.readLine().split(" "));

        System.out.println(calcMD(x,y,pType.p1));
        System.out.println(calcMD(x,y,pType.p2));
        System.out.println(calcMD(x,y,pType.p3));
        System.out.println(calcMD(x,y,pType.pInfinity));
    }

	private static int[] convertStringToInt(String[] str){
		int[] list = new int[str.length];
		for(int i=0; i<str.length;i++){
			list[i] = Integer.parseInt(str[i]);
		}
		return list;
	}


    private static double calcMD(int[] x, int[] y,pType type){
    	double D=0;
    	if(type.equals(pType.pInfinity)){
    		for(int i=0;i<x.length;i++){
    			double d = Math.abs(x[i]-y[i]);
    			if(D<=d){
    				D=d;
    			}
    		}
    	}else{
    		double d=0;
    		for(int i=0;i<x.length;i++){
    			d += Math.pow(Math.abs(x[i] - y[i]), type.getPType());
    		}
    		//d = Math.sqrt(d);
			D  =Math.pow(d, (double)1/type.getPType());
    	}
    	return D;
    }
}