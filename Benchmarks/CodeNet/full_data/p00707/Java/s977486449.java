import java.util.*;

class Main{
    static int w,h;
    // én_ÜÅÌsecret numberðÛ·é
    //long^ÉÍûÜçÈ¢ÌÅString^
    static String[][] fieldS;
    static int[][] fieldI;//Matrixðint^ÅÛ·é
    static List<String> numList;//1`9ðString^ÅÛ·éList

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//p©©ð»f·é½ßÉðString^ÅüêÄ¨­
	numList = new ArrayList<String>();
	for(int i=0; i<10; i++){
	    String num = Integer.toString(i);
	    numList.add(num);
	}

	w = sc.nextInt();
	h = sc.nextInt();

	while(w!=0 && h!=0){
	    fieldS = new String[h][w];
	    //null¾ÆãXssÈÌÅA·×Ä""Åú»
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    fieldS[i][j] = "";
		}
	    }
	    fieldI = new int[h][w];

	    //ÌêÍ»ÌÜÜðApÌêÍ-1ðüêé
	    for(int i=0; i<h; i++){
		String line = sc.next();//1sÇÝñÅ©ç
		for(int j=0; j<w; j++){
		    if(numList.contains(line.substring(j,j+1))){
			fieldI[i][j] = Integer.parseInt(line.substring(j,j+1));
		    }else{
			fieldI[i][j] = -1;
		    }
		}
	    }

	    String ans = solve();
	    if(!ans.equals("-1") && !ans.equals(""))System.out.println(ans);
	    else if(ans.equals("-1"))System.out.println(1);

	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static String solve(){
	String up = "";
	String left = "";
	boolean hantei = false;
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldI[i][j]!=-1){
		    //»ÝnÌãÆ¶ÜÅÌsecret numberðärµÄAå«¢ûÉ©gðt¯Á¦éB
		    hantei = false;
		    if(i-1>=0){up = fieldS[i-1][j]; hantei=true;}//ãÌl
		    if(j-1>=0){left = fieldS[i][j-1]; hantei=true;}//¶Ìl
		    if(hantei ||(i==0 && j==0)){//ãÜ½Í¶ÉlªüÁÄ¢êÎ
			String select = getLargerOne(up,left);//ãÆ¶Åå«¢ûÉ
			fieldS[i][j] = select + Integer.toString(fieldI[i][j]);//t¯Á¦é
			if(fieldS[i][j].equals("0")){fieldS[i][j]="";}//Åª0Èç
			up = "";
			left = "";
		    }else {fieldS[i][j]=Integer.toString(fieldI[i][j]);}//©gÌÝðãü
		}
	    }
	}
	String max = getMax();
	return max;
    }

    //2ÂÌsecret numberðärµÄAå«¢ûðÔ·
    public static String getLargerOne(String up, String left){

	if(up.length()>left.length()){return up;}
	else if(left.length()>up.length()){return left;}

	//secret numberÌ·³ª¯¶Å êÎAå«¢Ê©çÉä×Ä¢­
	for(int i=0; i<up.length(); i++){
	    int upI = Integer.parseInt(up.substring(i,i+1));
	    int leftI = Integer.parseInt(left.substring(i,i+1));
	    if(upI>leftI){return up;}
	    else if(leftI>upI){return left;}
	}
	return up;//2ÂÆàS­¯¶Ìê
    }

    //secret numberÌÅålðßÄÔ·
    public static String getMax(){
	//·³ÌÅålðßé
	int maxLen = 0;
	List<String> sameLen = new ArrayList<String>();
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldS[i][j].length()>maxLen){
		    maxLen = fieldS[i][j].length();
		}
	    }
	}

	//ãÅß½·³ÌÅålÆêv·ésecret number¾¯ðListÉüêé
	for(int i=0; i<h; i++){
	    for(int j=0; j<w; j++){
		if(fieldS[i][j].length()==maxLen){
		    sameLen.add(fieldS[i][j]);
		}
	    }
	}

	//ÄÍÜéÌª1Â¾¯Ìê
	if(sameLen.size()==1){return sameLen.get(0);}

	//¡ÉÄÍÜÁ½êAå«¢Ê©çÉär·é
	int maxInt = 0;
	for(int i=0; i<maxLen; i++){
	    maxInt = 0;
	    for(int j=0; j<sameLen.size(); j++){
		String a = sameLen.get(j);
		int num = Integer.parseInt(a.substring(i,i+1));
		if(num>maxInt){maxInt=num; j=-1;}//ÅålªXV³ê½çA0ÔÚ©çärµÈ¨µ
		else if(num<maxInt){sameLen.remove(j); j--;}//Åålæè¬³©Á½çí
		else if(num==maxInt && i==maxLen-1 && j==sameLen.size()-1){return sameLen.get(0);}//S­¯¶secret numberª¡ Á½ê
		if(sameLen.size()==1){return sameLen.get(0);}//ÅãÌ1ÂÉÈÁ½çA»êðÔ·
	    }
	}
	return "-1";//ªêÂàÈ©Á½
    }
}