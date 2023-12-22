import java.util.*;

class Main{
    static int[] motoX;//³ÉÈéÜêüÌxÀW
    static int[] motoY;//³ÉÈéÜêüÌyÀW
    static int[] count;//½ÔÚÌ`Æêvµ½©
    static int kaitensu;//ñ]
    static int n;//ÜêüÌ{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int honsu = sc.nextInt();//ÜêüÌ{
	while(honsu!=0){
	    count = new int[honsu+1];	
	    n = 0;	    
	    //³ÆÈéÜêü
	    int moto = sc.nextInt();
	    motoX = new int[moto];
	    motoY = new int[moto];
	    for(int i=0; i<moto; i++){
		motoX[i] = sc.nextInt();
		motoY[i] = sc.nextInt();
	    }
	    
	    //är·éÜêüÌ¾¯JèÔ·
	    while(honsu!=0){
		n++;
		kaitensu = 0;
		//är·éÜêü
		int m = sc.nextInt();
		int[] x = new int[m];
		int[] y = new int[m];
		for(int i=0; i<m; i++){
		    x[i] = sc.nextInt();
		    y[i] = sc.nextInt();
		}
		solve(x,y);
		
		honsu--;
	    }
	    //êvµ½ÜêüÌÔðoÍ
	    for(int i=0; i<count.length; i++){
		if(count[i]==1)System.out.println(i);
	    }
	    System.out.println("+++++");
	    honsu = sc.nextInt();
	}
    }

    public static void solve(int[] x, int[] y){
	if(x.length!=motoX.length)return;//¸_ÌªáÁ½çreturn
	for(int j=0; j<2; j++){
	    int moveX = motoX[0]-x[0];//³ÌÜêüÆär·éÜêüÆÌÀW·
	    int moveY = motoY[0]-y[0];
	    if(hantei(x,y,moveX,moveY))count[n] = 1;//êv·é©»è
	    x = reverse(x);//tÉ·é
	    y = reverse(y);
	}

	if(kaitensu==3){return;}//êüµ½
	kaiten();//³ÌÜêüðñ]
	solve(x,y);
    }
    
    //³Ì`Æär·é`ªêvµÄ¢é©Ç¤©»è·é
    public static Boolean hantei(int[] x, int[] y, int moveX, int moveY){
	for(int i=0; i<x.length; i++){
	    if(x[i]+moveX != motoX[i])return false;
	    if(y[i]+moveY != motoY[i])return false;
	}
	return true;
    }
   
    //³Ì`ð90xñ]·é
    public static void kaiten(){
	kaitensu++;
	for(int i=0; i<motoX.length; i++){
	    int temp = motoX[i];
	    motoX[i] = motoY[i];
	    motoY[i] = temp - temp - temp;
	}
    }

    //zñÌgðtÉ·é
    public static int[] reverse(int[] line){
	int[] reverse = new int[line.length];
	for(int i=0; i<line.length; i++){
	    reverse[i] = line[line.length-i-1];
	}
	return reverse;
    }
}