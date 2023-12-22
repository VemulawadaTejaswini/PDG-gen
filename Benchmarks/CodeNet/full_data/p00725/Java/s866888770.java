import java.util.*;

class Main{
    static int min;//Ú®ñÌÅ¬l
    static int goalX,goalY;//S[ÌÀW
    static int w,h;//A³
    static int[][] field;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	w = sc.nextInt();
	h = sc.nextInt();

	while(w!=0 && h!=0){

	    min = 11;
	    field = new int[h][w];//ÕÊ
	    int startX = 0;//X^[gn_ÌxÀW
	    int startY = 0;//X^[gn_ÌyÀW
	    for(int i=0; i<h; i++){
		for(int j=0; j<w; j++){
		    field[i][j] = sc.nextInt();
		    if(field[i][j]==2){startX = j; startY = i; field[i][j]=0;}//X^[g
		    if(field[i][j]==3){goalX = j; goalY = i;}//S[
		}
	    }
	    solve(0,startX,startY);

	    if(min==11)min=-1;//S[ÉHè¯È©Á½
	    System.out.println(min);

	    w = sc.nextInt();
	    h = sc.nextInt();
	}
    }

    public static void solve(int count, int posX, int posY){
	if(posX==goalX && posY==goalY){//S[ÌÀWÆêvµ½ç
	    if(count<min)min = count;//Å¬lXV
	    return;
	}
	
	if(count>=10){return;}

	int pos = go(1,posX,posY);
	boolean hantei = false;
	if(pos!=-1){//ãûü
	    if(pos-1>=0 && field[pos-1][posX]==1){
		field[pos-1][posX]=0;//áQ¨ðÁ·
		hantei = true;
	    }
	    solve(count+1,posX,pos);
	    if(hantei){
		field[pos-1][posX] = 1; hantei = false;
	    }
	}
	pos = go(2,posX,posY);
	if(pos!=-1){//ºûü
	    if(pos+1<h-1 && field[pos+1][posX]==1){
		field[pos+1][posX]=0;
		hantei = true;
	    }
	    solve(count+1,posX,pos);
	    if(hantei){
		field[pos+1][posX] = 1; hantei = false;
	    }
	}
	pos = go(3,posX,posY);
	if(pos!=-1){//Eûü
	    if(pos+1<w-1 && field[posY][pos+1]==1){
		field[posY][pos+1]=0;
		hantei = true;
	    }
	    solve(count+1,pos,posY);
	    if(hantei){
		field[posY][pos+1] = 1; hantei = false;
	    }
	}
	pos = go(4,posX,posY);
	if(pos!=-1){//¶ûü
	    if(pos-1>=0 && field[posY][pos-1]==1){
		field[posY][pos-1]=0;
		hantei = true;
	    }
	    solve(count+1,pos,posY);
	    if(hantei){
		field[posY][pos-1] = 1; hantei = false;
	    }
	}
    }

    //êèÌûüÉißé¾¯iÞ
    public static int go(int houko,int posX,int posY){
	if(posX<0 || posY<0)return -1;
	if(houko==1){//ãûü
	    if(posY-1>=0 && field[posY-1][posX]==1)return -1;//áQ¨ª ÁÄißÈ¢
	    for(;;){
		if(posY-1<0)return -1;//[©ç¿½
		if(field[posY-1][posX]==3){return posY-1;}//S[Èç
		if(field[posY-1][posX]==1){return posY;}//áQ¨ÉÔÂ©Á½ç
		posY--;//iÞ
	    }
	}
	if(houko==2){//ºûü
	    if(posY+1<=h-1 && field[posY+1][posX]==1)return -1;
	    for(;;){
		if(posY+1>h-1)return -1;
		if(field[posY+1][posX]==3){return posY+1;}
		if(field[posY+1][posX]==1){return posY;}
		posY++;
	    }
	}
	if(houko==3){//Eûü
	    if(posX+1<=w-1 && field[posY][posX+1]==1)return -1;
	    for(;;){
		if(posX+1>w-1)return -1;
		if(field[posY][posX+1]==3){return posX+1;}
		if(field[posY][posX+1]==1){return posX;}
		posX++;
	    }
	}
	if(houko==4){//¶ûü
	    if(posX-1>=0 && field[posY][posX-1]==1)return -1;
	    for(;;){
		if(posX-1<0)return -1;
		if(field[posY][posX-1]==3){return posX-1;}
		if(field[posY][posX-1]==1){return posX;}
		posX--;
	    }
	}
	return -1;
    }
}