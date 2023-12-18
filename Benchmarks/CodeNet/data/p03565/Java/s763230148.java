import java.util.Scanner;


public  class Main  {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String Sy = sc.next();
		char Syc[] = Sy.toCharArray();
		String M = sc.next();
		char Mc[] = M.toCharArray();
		int Mlength = M.length();
		int quetionnumber = 0; //?文字列の存在する個数
		boolean qutionflag = false;

		for(int i = 0; i<Sy.length(); i++) {
			if(qutionflag ==false&&Syc[i]=='?') { qutionflag =true;quetionnumber++;}
			if(qutionflag == true&&Syc[i]!='?') qutionflag=false;

		}//quetionnumber取得
		qutionflag = false;
		/*System.out.println("number:"+quetionnumber);//確かめ用*/

		int quetionsize[] = new int[quetionnumber]; //一つ一つのquetion文字列の大きさを格納
		int quetionidx[] = new int[quetionnumber]; //その？文字列の開始添字を格納する
		int quetionsize_idx = 0; int quetionidx_idx = 0;
		int quetionsizemax = 0; int quetionsizemax_idx = 0;
		for(int i = 0; i<Sy.length(); i++) {
			if(qutionflag ==true&&Syc[i]=='?')quetionsize[quetionsize_idx]++;
			if(qutionflag == false&&Syc[i]=='?') {qutionflag = true;quetionsize[quetionsize_idx]++;
			quetionidx[quetionidx_idx] = i; quetionidx_idx++;}
			if(qutionflag ==true&&Syc[i]!='?') {qutionflag = false; quetionsize_idx++;}


		}
		for(int  i= 0; i<quetionnumber; i++) {
			if(quetionsizemax<=quetionsize[i]) {quetionsizemax = quetionsize[i]; quetionsizemax_idx = quetionidx[i];}
		}
/*
		for(int i = 0; i<quetionnumber; i++) {
			System.out.println("idx:"+quetionidx[i]);
			System.out.println("size:"+quetionsize[i]);
			System.out.println("");
		} //確かめ用*/

		int Mnumber[] = new int[M.length()];
		int Mnumber_idx = 0;
		int maxnumber = 0;

		boolean Mflag = false;
		for(int i = 0; i<M.length(); i++) {
			for(int j = 0; j<Sy.length();j++) {
				if(Mc[i] == Syc[j])Mnumber[i]++;
			}
			Mflag = false;
		}
		for(int i = 0; i<M.length();i++) {
			if(Mnumber[i]>maxnumber) maxnumber =Mnumber[i];
		}
		/*       
		System.out.println("*number*");
		System.out.println("maxnumber:"+maxnumber);
		for(int i = 0; i<M.length(); i++) {
			System.out.println(Mc[i]+":"+Mnumber[i]);
		}System.out.println("");//確かめ用*/

	int M_idx[][] = new int[M.length()][maxnumber];
	int M_idx_idx = 0;
		for(int i = 0; i<M.length(); i++) {
			int p =0;
			M_idx_idx = 0;
			for(int j = 0; j<Sy.length(); j++) {
				if(M_idx_idx>Mnumber[i])break;
				if(Mc[i]==Syc[j]) {
					M_idx[i][M_idx_idx] = j;
					M_idx_idx++;
				}

			}

		} //M_idx代入
		/*System.out.println("");
		System.out.println("*idx*");
		for(int i =0; i<M.length();i++) {
			System.out.println("");
			System.out.println(Mc[i]+"*");
			for(int j = 0;j<Mnumber[i];j++) {
				System.out.println(Mc[i]+":"+j+":"+M_idx[i][j]);
			}
		} //確かめ用 */

		int min =Sy.length();
		int max_idx = 0; //　右に数が大きいほど辞書順最小
		boolean RESTORABLE = false; //trueで鍵が存在する
		int right = 0;
		int left = M.length()-1; //その文字より右にleft
		int Msartidx = 0; //Mを差し込めるidxを求める
		for(int i = 0; i<M.length(); i++) {
			for(int j= Sy.length()-1; j>=0;j--) {
				boolean rightflag = true; //その値が通らなければfalseを返す
				boolean leftflag = true;
				if(Mc[i]==Syc[j]) {
					for(int t = 0; t<right; t++) {
						if(j-t<0) {rightflag = false; break;}
						if(Mc[i-t]==Syc[j-t]||Syc[j-t]=='?')continue;
						else rightflag = false;
					}
					for(int t = 0; t<left; t++) {
						if(j+t>Sy.length()-1) {leftflag = false; break;}
						if(Mc[i+t]==Syc[j+t]||Syc[j+t]=='?')continue;
						else leftflag=false;
					}
					if(rightflag&&leftflag) {
						Msartidx = j-i;
						max_idx = Msartidx;
						RESTORABLE = true;
					}
					
				}
				
				
				
			}
			right = i;
			left =  left-i;
		}
		

		if(M.length()<=quetionsizemax) {
			if(max_idx<quetionsizemax_idx )max_idx = quetionsizemax_idx;
		}
		/*System.out.println(max_idx);*/
		String S = "";
		boolean Sflag = false; //max_idxに到達したらtrue　終わればfalse
		int c_idx = 0; //文字を入力する大きさidx
		if(RESTORABLE) {
		for(int i = 0; i<Sy.length(); i++) {
			if(!Sflag&&Syc[i]=='?') {S = S+"a";continue;}
			if(!Sflag&&i==max_idx) {Sflag =true; }
			if(!Sflag&&Syc[i]!='?') {S = S+Syc[i];continue;}
			if(Sflag) {S=S+Mc[c_idx]; c_idx++; if(c_idx>M.length()-1)Sflag =false;}
		}
		System.out.println(S);
	}else {
		System.out.println("UNRESTORABLE");
		
	}


		}




	}





