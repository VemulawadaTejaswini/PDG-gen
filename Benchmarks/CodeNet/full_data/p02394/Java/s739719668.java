//ITP1_2_D#########################################
import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();// br インスタンスのreadlineメソッドを利用
		//split関数で配列に入れる。
		String[] strArray=str.split(" ");

	
		//円と長方形のクラスからインスタンスを作成する
		Circle Ci =new Circle(Integer.parseInt(strArray[2]),Integer.parseInt(strArray[3]),Integer.parseInt(strArray[4]));
	
		Rectangle Re=new Rectangle(Integer.parseInt(strArray[0]),Integer.parseInt(strArray[1]));
		
		
		isCircleInRectangle(Re, Ci);
	}
    	
	public static void isCircleInRectangle(Rectangle rectangle, Circle circle) throws Exception{
		if (circle.getMaxX()<= rectangle.W
			&& circle.getMaxY() <=rectangle.H
			&& circle.getMinX()>=0
			&& circle.getMinY()>=0){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}	
	
}

 class Circle{

	int x;
	int y;
	int r;
	//コンストラクタの記述
	Circle(int x_,int y_, int r_){
	this.x=x_;
	this.y=y_;
	this.r=r_;
	}
	
	int getMinX() {
		return  x - r;
	}
	int getMinY() {
		return  y - r;
	}
	int getMaxX() {
		return  x + r;
	}
	int getMaxY() {
		return  y + r;
	}
}
	
 class Rectangle{
	int H;
	int W;
	//コンストラクタの記述
	Rectangle(int W_, int H_){
	this.H=H_;
	this.W=W_;
	}
}

