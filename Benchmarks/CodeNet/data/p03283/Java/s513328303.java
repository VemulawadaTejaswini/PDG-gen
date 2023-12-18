import java.util.*;
import java.awt.Point;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();
	int Q = sc.nextInt();
	Point[] mPoint = new Point[M];
	Point[] cPoint = new Point[Q];
	for(int i = 0; i< M; i++) {
	    mPoint[i] = new Point(sc.nextInt(), sc.nextInt());
	}
	for(int i = 0; i < Q; i++) {
	    cPoint[i] = new Point(sc.nextInt(), sc.nextInt());
	}
	for(int i = 0; i < Q; i++) {
	    int cityX = (int)cPoint[i].getX();
	    int cityY = (int)cPoint[i].getY();
	    int cnt = 0;
	    for(int j = 0; j < M; j++) {
		int x = (int)mPoint[j].getX();
		int y = (int)mPoint[j].getY();
		if(cityX <= x && y <= cityY) {
		    cnt++;
		}
	    }
	    System.out.println(cnt);
	}

    }
}