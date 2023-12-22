import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Dice d;
		int n;
		
		while(true){
			n = sc.nextInt();
			if(n == 0){
				break;
			}
			
			d = new Dice();
			for(int i=0;i<n;i++){
				d.moveDice(sc.next());
				d.addTop();
			}
			System.out.println(d.getSum());
		}
	}
}

class Dice{
	int[] num,tmp;
	int sum;
	
	Dice(){
		num = new int[6];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 5;
		num[4] = 4;
		num[5] = 6;
		tmp = new int[6];
		sum = 1;
	}
	
	public void addTop(){
		sum += num[0];
	}
	
	public int getSum(){
		return sum;
	}
	
	public void moveDice(String str){
		if(str.equals("North")){
			moveNorth();
		}else if(str.equals("East")){
			moveEast();
		}else if(str.equals("South")){
			moveSouth();
		}else if(str.equals("West")){
			moveWest();
		}else if(str.equals("Right")){
			moveRight();
		}else if(str.equals("Left")){
			moveLeft();
		}
	}
	
	public void moveNorth(){
		setTmp();
		num[0] = tmp[1];
		num[1] = tmp[5];
		num[3] = tmp[0];
		num[5] = tmp[3];
	}
	
	public void moveEast(){
		setTmp();
		num[0] = tmp[4];
		num[2] = tmp[0];
		num[4] = tmp[5];
		num[5] = tmp[2];
	}
	
	public void moveSouth(){
		setTmp();
		num[0] = tmp[3];
		num[1] = tmp[0];
		num[3] = tmp[5];
		num[5] = tmp[1];
	}
	
	public void moveWest(){
		setTmp();
		num[0] = tmp[2];
		num[2] = tmp[5];
		num[4] = tmp[0];
		num[5] = tmp[4];
	}
	
	public void moveRight(){
		setTmp();
		num[1] = tmp[2];
		num[2] = tmp[3];
		num[3] = tmp[4];
		num[4] = tmp[1];
	}
	
	public void moveLeft(){
		setTmp();
		num[1] = tmp[4];
		num[2] = tmp[1];
		num[3] = tmp[2];
		num[4] = tmp[3];
	}
	
	public void setTmp(){
		for(int i=0;i<6;i++){
			tmp[i] = num[i];
		}
	}
}