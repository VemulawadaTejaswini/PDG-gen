import java.util.*;


public class Main {

	/**
	 * @param args
	 */

	Scanner sc = new Scanner(System.in);
	int moto,z=1,sua[]=new int[4],sub[]=new int[4],total[]=new int[16],out[]=new int[4],tc=0,count=0;
	String info[] = {"1","i","j","k"},tinfo[] = new String[16];

	void in(){

		moto = sc.nextInt();

		while(0 != moto){
			if(count >= moto){
				moto = sc.nextInt();
				count = 0;
			}else{
				for(int t=0;t<moto;t++){
					for(int i=0;i<4;i++){
						sua[i] = sc.nextInt();
					}
					for(int i=0;i<4;i++){
						sub[i] = sc.nextInt();
					}
					count++;
					syori();

					Arrays.fill(out, 0);
					tc = 0;
				}
			}
		}
	}

	void syori(){
		for(int l=0;l<4;l++){
			for(int y=0;y<4;y++){
				total[tc] = sua[l] * sub[y];
				tinfo[tc] = info[l] + info[y];
				tc++;
			}
		}
		for(int n=0;n<16;n++){
			if("11".equals(tinfo[n])){
				out[0] += total[n];
			}else{
				if("ii".equals(tinfo[n])|| "kk".equals(tinfo[n])|| "jj".equals(tinfo[n])){
					out[0] -= total[n];
				}else{
					if("1i".equals(tinfo[n])|| "i1".equals(tinfo[n])|| "jk".equals(tinfo[n])){
						out[1] += total[n];
					}else{
						if("1j".equals(tinfo[n]) || "j1".equals(tinfo[n]) || "ki".equals(tinfo[n])){
							out[2] += total[n];
						}else{
							if("1k".equals(tinfo[n]) || "k1".equals(tinfo[n]) || "ij".equals(tinfo[n])){
								out[3] += total[n];
							}else{
								if("ji".equals(tinfo[n])){
									out[3] -= total[n];
								}else{
									if("ik".equals(tinfo[n])){
										out[2] -= total[n];
									}else{
										if("kj".equals(tinfo[n])){
											out[1] -= total[n];
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for(int u=0;u<4;u++){
			System.out.print(out[u]);
			if(u < 3){
				System.out.print(" ");
			}else{
			}
		}
		System.out.println();
	}



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Main q = new Main();
		q.in();
	}

}