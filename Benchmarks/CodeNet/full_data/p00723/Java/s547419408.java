import java.util.*;

class Main{

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

	int m = sc.nextInt();//f[^Zbg

	while(m!=0){
	    String train = sc.next();//ñÔÌÒ¬
	    System.out.println(solve(train));
	    m--;
	}
    }

    public static int solve(String train){
	List<String> hensei = new ArrayList<String>();//Ò¬ðd¡ÈµÅL^
	for(int i=0; i<train.length()-1; i++){
	    String mae = train.substring(0,i+1);//ªµ½Æ«ÌO¼ª
	    String ushiro = train.substring(i+1,train.length());//ã¼ª
	    String[] type = new String[4];
	    for(int k=0; k<2; k++){
		type[0] = mae + ushiro;//OF»ÌÜÜ@ãF»ÌÜÜ
		type[1] = mae + hanten(ushiro);//OF»ÌÜÜ@ãF½]
		type[2] = hanten(mae) + ushiro;//OF½]@ãF»ÌÜÜ
		type[3] = hanten(mae) + hanten(ushiro);//OF½]@ãF½]
		for(int j=0; j<type.length; j++)
		    if(!hensei.contains(type[j])){hensei.add(type[j]);}
		String tmp = mae;//OãüêÖ¦
		mae = ushiro;
		ushiro = tmp;
	    }
	}
	return hensei.size();
    }

    //¶ñð½]·é
    public static String hanten(String s){
	String hanten = "";
	for(int i=s.length()-1; i>=0; i--){
	    String last = s.substring(i,i+1);//êÔãë©çæèo·
	    hanten += last;//æª©çüêé
	}
	return hanten;
    }
}