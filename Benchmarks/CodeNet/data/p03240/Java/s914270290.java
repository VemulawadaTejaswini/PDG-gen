import java.util.*;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		//高さの初期値０にする。
    int MaxH = 0;
    int firstMaxHX = -1;
    int firstMaxHY = -1;
    int secondMaxHX = -1;
    int secondMaxHY = -1;
    int beforeX = -1;
    int beforeY = -1;
    int cx = -1;
    int cy = -1;

    //ルートの数　ループ回数になる
		int N = sc.nextInt();

    for(int i =0; i < N; i++){

  		int x = sc.nextInt();
      int y = sc.nextInt();
      int h = sc.nextInt();
      if(x == 0 && y == 0 || x == 100 && y == 100){
        MaxH = h;
        cx = x;
        cy = y;
        System.out.println(cx +  " " + cy + " " + MaxH );
        System.exit(0);
      }
      if(h > MaxH){
        MaxH = h;
        beforeX = firstMaxHX;
        beforeY = firstMaxHY;
        firstMaxHX = x;
        firstMaxHY = y;
      }
      else if(h == MaxH){
        if(secondMaxHX == -1){
          secondMaxHX = x;
          secondMaxHY = y;
        }
      }
    }
    
    if(firstMaxHX == secondMaxHX){
      cx = firstMaxHX;
      cy = (firstMaxHY + secondMaxHY)/2;
      MaxH += 1;
    }
    else if(firstMaxHY == secondMaxHY){
      cx = (firstMaxHX + secondMaxHX)/2;
      cy = firstMaxHY;
      MaxH += 1;
    }
    else {
      if(firstMaxHX >= beforeX ){
        secondMaxHX += Math.abs(firstMaxHX - secondMaxHX);
        secondMaxHY -= Math.abs(firstMaxHY - secondMaxHY);
        if(firstMaxHX == secondMaxHX){
          cx = firstMaxHX;
          cy = (firstMaxHY + secondMaxHY)/2;
          MaxH += 1;
        }
        else if(firstMaxHY == secondMaxHY){
          cx = (firstMaxHX + secondMaxHX)/2;
          cy = firstMaxHY;
          MaxH += 1;
        }
      }
      else{
        secondMaxHX -= Math.abs(firstMaxHX - secondMaxHX);
        secondMaxHY += Math.abs(firstMaxHY - secondMaxHY);
        if(firstMaxHX == secondMaxHX){
          cx = firstMaxHX;
          cy = (firstMaxHY + secondMaxHY)/2;
          MaxH += 1;
        }
        else if(firstMaxHY == secondMaxHY){
          cx = (firstMaxHX + secondMaxHX)/2;
          cy = firstMaxHY;
          MaxH += 1;
        }
      }
    }

    System.out.println(cx +  " " + cy + " " + MaxH );
	}
}
