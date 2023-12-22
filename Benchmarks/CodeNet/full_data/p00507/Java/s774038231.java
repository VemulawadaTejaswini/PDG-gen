import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int[] syugo;
		int youso_kazu;

		try {
			str=bfr.readLine();
			youso_kazu=Integer.parseInt(str);
			syugo=new int[youso_kazu];

			for(int i=0; i<youso_kazu; i++) {
				str=bfr.readLine();
				syugo[i]=Integer.parseInt(str);
			}

			int[] rank=new int[3];
			for(int i=0; i<3; i++) {
				rank[i]=2000000000;
			}
			int kekka=0;
			String combine="";
			int tmp1,tmp2=0;
			for(int i=0; i<youso_kazu; i++) {
				for(int j=0; j<youso_kazu; j++) {

					if(i==j) {
						// 何もしない
					}
					else {
						combine=String.valueOf(syugo[i])+String.valueOf(syugo[j]);
						kekka=Integer.parseInt(String.valueOf(combine));

						if(kekka<=rank[0] && kekka<=rank[1] && kekka<=rank[2]) {
							tmp1=rank[0];
							tmp2=rank[1];
							rank[1]=tmp1;
							rank[2]=tmp2;
							rank[0]=kekka;
						}

						else if(kekka>rank[0] && kekka<=rank[1] && kekka<=rank[2]) {
							tmp1=rank[1];
							tmp2=rank[2];
							rank[2]=tmp1;
							rank[1]=kekka;
						}

						if(kekka>rank[0] && kekka>rank[1] && kekka<=rank[2]) {
							tmp1=rank[2];
							rank[2]=tmp1;
						}
					}
				}
			}
			System.out.println(rank[2]);

			if(str=="") {
				System.exit(0);
			}
		}catch(IOException e) {

		}
	}
}
