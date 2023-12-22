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
		ArrayList<ArrayList> al2 = new ArrayList<ArrayList>();
		ArrayList<Integer> lsf = new ArrayList<Integer>();
		ArrayList<Integer> lsl = new ArrayList<Integer>();
		ArrayList<Integer> lsn = new ArrayList<Integer>();
		ArrayList<Integer> lsf2 = new ArrayList<Integer>();
		ArrayList<Integer> lsl2 = new ArrayList<Integer>();
		ArrayList<Integer> lsn2 = new ArrayList<Integer>();
		ArrayList<Integer> dead = new ArrayList<Integer>();

		while(true){
			ArrayList<Integer> al3 = new ArrayList<Integer>();
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
						al3.add(Integer.parseInt(String.valueOf(tes.charAt(i))));
						dead.add(0);
					}
				}catch(NumberFormatException e){
					break;
				}
			}
			if(d == 1){
				break;
			}
			al2.add(al3);
		}

		int num;
		int cl;
		int yn;
		
		for(int r=0;r<al2.size();r++){
			al = al2.get(r);
			num = 0;
			for(int i=0;i<12;i++){
				cl = -1;
				for(int j=0;j<12;j++){
					if(al.get(trans(i,j)) == 1){
						/*try{
							if(al.get(trans(i,j)) == 1){
								al2.set(trans(i,j), al2.get(trans(i,j)) + 1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						try{
							if(al.get(trans(i-1,j)) == 1){
								al2.set(trans(i,j), al2.get(trans(i,j)) + 1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						try{
							if(al.get(trans(i,j-1)) == 1){
								al2.set(trans(i,j), al2.get(trans(i,j)) + 1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						try{
							if(al.get(trans(i+1,j)) == 1){
								al2.set(trans(i,j), al2.get(trans(i,j)) + 1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						try{
							if(al.get(trans(i,j+1)) == 1){
								al2.set(trans(i,j), al2.get(trans(i,j)) + 1);
							}
						}catch(IndexOutOfBoundsException e){
							
						}
						
						if(al2.get(trans(i,j)) == 0){
							num++;
						}*/
						
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
						for(int w=0;w<lsf.size();w++){
							if((lsf2.get(q) <= lsf.get(w) && lsl.get(w)  <= lsl2.get(q)) 
									||(lsf.get(w) <= lsf2.get(q) && lsl2.get(q) <= lsl.get(w))){
								yn++;
								dead.set(w, dead.get(w) + 1);
								
								if(dead.get(w) < 2){
									if(yn >= 2){
										lsn.set(w, 2);
									}
									if(lsn2.get(q) == 2){
										lsn.set(w, 2);
									}
								}
							}
						}
						if(yn == 0 && lsn2.get(q) != 2){
							num++;

						}
					}
				}
				
				if(i == 11){
					for(int q=0;q<lsf.size();q++){
						if(lsn.get(q) != 2){
							num++;
						}
						if( lsn.get(q) == 2
								&& dead.get(q) != 1){
							num++;
						}
					}
				}
				
				
				lsf2.clear();
				lsl2.clear();
				lsn2.clear();
				dead.clear();
				
				for(int q=0;q<lsf.size();q++){
					lsf2.add(lsf.get(q));
					lsl2.add(lsl.get(q));
					lsn2.add(lsn.get(q));
				}
				
				lsf.clear();
				lsl.clear();
				lsn.clear();
				
				
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