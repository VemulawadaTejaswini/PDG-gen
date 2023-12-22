import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int dx = sc.nextInt();
	int dy = sc.nextInt();

	while(n!=0){

	    int posX = 0;
	    int posY = 0;

	    int maxX = 0;
	    int maxY = 0;
	    double max = 0;
	    for(;;){
		posX += dx;
		posY += dy;
		double dist = (posX*posX)+(posY*posY);
		if(dist>max){maxX=posX; maxY=posY; max=dist;}
		if(dist==max && posX>maxX){maxX=posX; maxY=posY;}

		dx = sc.nextInt();
		dy = sc.nextInt();
		if(dx==0 && dy==0)break;
	    }

	    System.out.println(maxX + " " + maxY);

	    n--;
	}
    }
}