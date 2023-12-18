import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int iin = sc.nextInt();
		int iik = sc.nextInt();
		double ikj = iik / 2;
		int iix = 0;
		int imvsum = 0;
		for(int i=0;i<iin;i++){
			 iix = sc.nextInt();
			 if(iix<ikj){
				 imvsum += iix * 2;
			 }
			 else{
				 imvsum += (iik-iix) * 2; 
			 }
		}
		
		System.out.println(imvsum);
    }
}
