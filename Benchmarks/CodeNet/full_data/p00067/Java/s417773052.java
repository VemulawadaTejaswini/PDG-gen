import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tes = null;
		int g=0;
		int d = 0;


		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<tyu> al2 = new ArrayList<tyu>();
		ArrayList<Integer> lsf = new ArrayList<Integer>();
		ArrayList<Integer> lsl = new ArrayList<Integer>();
		ArrayList<Integer> lsn = new ArrayList<Integer>();
		ArrayList<Integer> lsf2 = new ArrayList<Integer>();
		ArrayList<Integer> lsl2 = new ArrayList<Integer>();
		ArrayList<Integer> lsn2 = new ArrayList<Integer>();
		ArrayList<Integer> dead = new ArrayList<Integer>();

		while(true){
			tyu io = new tyu();
			for(int s=0;s<12;s++){
				try {
					tes = br.readLine();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
				if(tes == null){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				if(tes.equals("")){
					if(g == 1){
						d = 1;
						break;
					}
					g = 1;
					continue;
				}
				g = 0;
				try{
					
					for(int i=0;i<12;i++){
						io.t.add(Integer.parseInt(String.valueOf(tes.charAt(i))));
						dead.add(0);
					}
				}catch(NumberFormatException e){
					break;
				}
			}
			if(d == 1){
				break;
			}
			al2.add(io);

			//al.add(a);
		}
		
		/*for(int i=0;i<al2.size();i++){
			for(int j=0;j<12;j++){
				for(int k=0;k<12;k++){
					System.out.print(al2.get(i).get(trans(j,k)));
				}
				System.out.println();
			}
			System.out.println("\n");
		}*/
		
		int num;
		int cl;
		int yn;
		
		for(int r=0;r<al2.size();r++){
			al = al2.get(r).t;
			num = 0;
			for(int i=0;i<12;i++){
				cl = -1;
				for(int j=0;j<12;j++){
					if(al.get(trans(i,j)) == 1){
						
						if(j == 0 || al.get(trans(i,j-1)) == 0){
							lsf.add(j);
							lsl.add(j);
							lsn.add(1);
							cl++;
							dead.add(0);
						}
						try{
							if(j <= 10 && al.get(trans(i,j+1)) == 1){
								lsl.set(cl,j+1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						
					}
				}
				
				if(i != 0){
					for(int q=0;q<lsf2.size();q++){
						yn = 0;
					}
				}
			}
			
			System.out.println(num);
			
		}
		
	}
	public static int trans(int h,int w){
		int ret = 0;
		
		ret = h*12+w;
		
		
		return ret;
		
	}

}
class tyu{
	ArrayList<Integer> t = new ArrayList<Integer>();
	
}